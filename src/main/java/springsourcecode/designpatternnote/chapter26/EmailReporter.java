package springsourcecode.designpatternnote.chapter26;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import springsourcecode.designpatternnote.chapter26.dto.RequestInfo;
import springsourcecode.designpatternnote.chapter26.dto.RequestStat;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

public class EmailReporter {
    private static final Long DAY_HOURS_IN_SECONDS = 86400L;

    private MetricsStorage metricsStorage;
    private EmailSender emailSender;
    private List<String> toAddresses = Lists.newArrayList();

    public EmailReporter(MetricsStorage metricsStorage){
        this(metricsStorage,new EmailSender());
    }

    public EmailReporter(MetricsStorage metricsStorage,EmailSender emailSender){
        this.metricsStorage = metricsStorage;
        this.emailSender = emailSender;
    }

    public void  addToAddress(String address){
        this.toAddresses.add(address);
    }

    public void startDailyReport(){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE,1);
        calendar.set(Calendar.HOUR_OF_DAY,0);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        calendar.set(Calendar.MILLISECOND,0);
        Date firstTime = calendar.getTime();
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                long durationInMills = DAY_HOURS_IN_SECONDS * 1000;
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
            }
        },firstTime,DAY_HOURS_IN_SECONDS * 1000);
    }
}
