package springsourcecode.designpatterns.factory.test01;

public class AimaFactory implements CycleFactory {
    @Override
    public CycleProduct createProduct() {
        return new AimaCycle();
    }
}
