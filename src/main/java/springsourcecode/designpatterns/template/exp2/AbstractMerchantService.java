package springsourcecode.designpatterns.template.exp2;

import org.apache.catalina.connector.Response;

public abstract class AbstractMerchantService {
    public AbstractMerchantService(){

    }
    Response handlerTemplate(){

        queryMerchantInfo();

        signature();

        httpRequest();

        verifySignature();

        if (isRequestByProxy()) {
            httpProxy();
        }

        return null;
    }

    protected abstract void httpRequest();

    protected abstract void signature();

    protected abstract void queryMerchantInfo();

    protected abstract void verifySignature();

    protected abstract void httpProxy();

    abstract Boolean isRequestByProxy();
}
