package springsourcecode.designpatterns.observer;

public class ExportCompany implements Company {
    @Override
    public void response(int numnber) {
        System.out.println("出口公司汇率变动");
    }
}
