package springsourcecode.designpatterns.factory.test01;

public class YadeaFactory implements CycleFactory {
    @Override
    public CycleProduct createProduct() {
        return new YadeaCycle();
    }
}
