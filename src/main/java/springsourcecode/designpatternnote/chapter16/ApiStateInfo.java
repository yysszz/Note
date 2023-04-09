package springsourcecode.designpatternnote.chapter16;

public class ApiStateInfo {

    private String api;
    private long requestCount;
    private long errorRequest;
    private long durationOfSeconds;

    public ApiStateInfo(String api, long requestCount, long errorRequest, long durationOfSeconds) {
        this.api = api;
        this.requestCount = requestCount;
        this.errorRequest = errorRequest;
        this.durationOfSeconds = durationOfSeconds;
    }

    public ApiStateInfo(){}

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public long getRequestCount() {
        return requestCount;
    }

    public void setRequestCount(long requestCount) {
        this.requestCount = requestCount;
    }

    public long getErrorRequest() {
        return errorRequest;
    }

    public void setErrorRequest(long errorRequest) {
        this.errorRequest = errorRequest;
    }

    public long getDurationOfSeconds() {
        return durationOfSeconds;
    }

    public void setDurationOfSeconds(long durationOfSeconds) {
        this.durationOfSeconds = durationOfSeconds;
    }
}
