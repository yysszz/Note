package springsourcecode.designpatternnote.chapter26;

import springsourcecode.designpatternnote.chapter26.dto.RequestInfo;

import java.util.List;
import java.util.Map;

public interface MetricsStorage {

    public void saveRequestInfo(RequestInfo requestInfo);

    List<RequestInfo> getRequestInfos(String apiName,long startTimeInMillis,long endTimeInMillis);

    Map<String,List<RequestInfo>> getRequestInfos(long startTimeInMillis,long endTimeInMillis);
}
