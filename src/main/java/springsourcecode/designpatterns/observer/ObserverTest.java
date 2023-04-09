package springsourcecode.designpatterns.observer;

public class ObserverTest {


    public static void main(String[] args) {
        Rate rate = new RMBRate();
        rate.add(new ExportCompany());
        rate.add(new ImportCompany());
        rate.change(1);
    }
}
