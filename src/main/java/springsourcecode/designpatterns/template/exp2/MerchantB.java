package springsourcecode.designpatterns.template.exp2;

import org.apache.catalina.connector.Response;

public class MerchantB extends AbstractMerchantService {
    @Override
    protected void httpRequest() {

    }

    @Override
    protected void signature() {

    }

    @Override
    protected void queryMerchantInfo() {

    }

    @Override
    protected void verifySignature() {

    }

    @Override
    protected void httpProxy() {

    }

    @Override
    Boolean isRequestByProxy() {
        return false;
    }

    public static void main(String[] args) {
        MerchantB merchantB = new MerchantB();
        Response response = merchantB.handlerTemplate();
    }
}
