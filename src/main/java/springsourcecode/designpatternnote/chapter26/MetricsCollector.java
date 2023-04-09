package springsourcecode.designpatternnote.chapter26;

import org.apache.commons.lang3.StringUtils;
import springsourcecode.designpatternnote.chapter26.dto.RequestInfo;

public class MetricsCollector {

    private MetricsStorage metricsStorage;

    public MetricsCollector(MetricsStorage metricsStorage){
        this.metricsStorage = metricsStorage;
    }

    public void recordRequest(RequestInfo requestInfo){
        if (requestInfo == null || StringUtils.isBlank(requestInfo.getApiName())) {
            return;
        }
        metricsStorage.saveRequestInfo(requestInfo);
    }
}
