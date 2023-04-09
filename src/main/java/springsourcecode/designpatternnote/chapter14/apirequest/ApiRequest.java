package springsourcecode.designpatternnote.chapter14.apirequest;

import com.google.common.base.Splitter;
import com.google.common.collect.Maps;

import java.util.Map;

public class ApiRequest {

    private String baseUrl;

    private String token;

    private String appId;

    private long timeStamp;

    public ApiRequest(String baseUrl, String token, String appId, long timeStamp) {
        this.baseUrl = baseUrl;
        this.token = token;
        this.appId = appId;
        this.timeStamp = timeStamp;
    }

    public static ApiRequest createFromFullUrl(String url){
        String[] strings = url.split("//?");
        Iterable<String> paramsIterable = Splitter.on("&").trimResults().split(strings[1]);
        Map<String, String> paramsMap = Maps.newHashMap();
        paramsIterable.forEach(str ->
                paramsMap.put(str.substring(0,str.indexOf("=")),str.substring(str.indexOf("=") + 1,str.length() + 1))
        );
        return new ApiRequest(strings[0],paramsMap.get("token"),paramsMap.get("appId"),Long.valueOf(paramsMap.get("timeStamp")));
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public String getToken() {
        return token;
    }

    public String getAppId() {
        return appId;
    }

    public long getTimeStamp() {
        return timeStamp;
    }
}
