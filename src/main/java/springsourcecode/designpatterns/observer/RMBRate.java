package springsourcecode.designpatterns.observer;

public class RMBRate extends Rate {
    @Override
    public void change(int number) {
        for (Company company : list) {
            company.response(number);
        }
    }
}
