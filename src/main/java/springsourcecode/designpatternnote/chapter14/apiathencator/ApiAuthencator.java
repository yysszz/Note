package springsourcecode.designpatternnote.chapter14.apiathencator;

import springsourcecode.designpatternnote.chapter14.apirequest.ApiRequest;

public interface ApiAuthencator {

    void auth(String url);

    void auth(ApiRequest apiRequest);
}
