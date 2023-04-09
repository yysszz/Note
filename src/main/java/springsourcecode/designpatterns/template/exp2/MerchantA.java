package springsourcecode.designpatterns.template.exp2;

import org.apache.catalina.connector.Response;

public class MerchantA extends AbstractMerchantService {
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
        return true;
    }

    public static void main(String[] args) {
        int a = 2/0;
        MerchantA merchantA = new MerchantA();
        Response response = merchantA.handlerTemplate();
    }
}
