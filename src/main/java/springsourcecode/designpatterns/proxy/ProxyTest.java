package springsourcecode.designpatterns.proxy;

public class ProxyTest {

    public static void main(String[] args) {
        Client client = new Client();
        client.buy(new SGProxy());
    }
}
