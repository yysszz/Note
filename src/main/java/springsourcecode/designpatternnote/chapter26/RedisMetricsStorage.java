package springsourcecode.designpatternnote.chapter26;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import springsourcecode.designpatternnote.chapter26.dto.RequestInfo;

import java.util.List;
import java.util.Map;

public class RedisMetricsStorage implements MetricsStorage {
    @Override
    public void saveRequestInfo(RequestInfo requestInfo) {

    }

    @Override
    public List<RequestInfo> getRequestInfos(String apiName, long startTimeInMillis, long endTimeInMillis) {
        return Lists.newArrayList();
    }

    @Override
    public Map<String, List<RequestInfo>> getRequestInfos(long startTimeInMillis, long endTimeInMillis) {
        return Maps.newHashMap();
    }
}
