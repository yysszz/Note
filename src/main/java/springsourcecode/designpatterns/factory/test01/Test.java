package springsourcecode.designpatterns.factory.test01;

public class Test {

    public static void main(String[] args) {
        CycleFactory cycleFactory = new AimaFactory();
        CycleProduct product = cycleFactory.createProduct();
        product.show();
        CycleFactory cycleFactory1 = new YadeaFactory();
        CycleProduct product1 = cycleFactory1.createProduct();
        product1.show();
    }
}
