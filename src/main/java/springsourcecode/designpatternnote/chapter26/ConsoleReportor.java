package springsourcecode.designpatternnote.chapter26;

import com.google.common.collect.Maps;
import springsourcecode.designpatternnote.chapter26.dto.RequestInfo;
import springsourcecode.designpatternnote.chapter26.dto.RequestStat;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ConsoleReportor {
    private MetricsStorage metricsStorage;
    private ScheduledExecutorService executor;

    public ConsoleReportor(MetricsStorage metricsStorage){
        this.metricsStorage = metricsStorage;
        executor = Executors.newSingleThreadScheduledExecutor();
    }

    public void startRepeatedReport(long periodInSeconds, long durationInSeconds){
        executor.scheduleAtFixedRate(() -> {
            long durationInMills = durationInSeconds*1000;
            long endTimeInMills = System.currentTimeMillis();
            long startTimeInMills = endTimeInMills - durationInMills;
            Map<String, List<RequestInfo>> requestInfos = metricsStorage.getRequestInfos(startTimeInMills, endTimeInMills);
            Map<String, RequestStat> stats = Maps.newHashMap();
            for (Map.Entry<String, List<RequestInfo>> entry : requestInfos.entrySet()) {
                String apiName = entry.getKey();
                List<RequestInfo> requestInfosPerApi = entry.getValue();
                RequestStat requestStat = Aggregator.aggregate(requestInfosPerApi, durationInMills);
                stats.put(apiName,requestStat);
            }
            System.out.println("Time Span:[" + startTimeInMills + "," + endTimeInMills + "]");
        },0,periodInSeconds, TimeUnit.SECONDS);
    }
}
