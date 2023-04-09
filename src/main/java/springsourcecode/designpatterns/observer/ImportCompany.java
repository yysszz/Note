package springsourcecode.designpatterns.observer;

public class ImportCompany implements Company {
    @Override
    public void response(int numnber) {
        System.out.println("进口公司汇率变动");
    }
}
