package springsourcecode.designpatterns.abstractfactory.example1;

public class Test {
    public static void main(String[] args) {

        AbstractFactory sgFactory = new SGFactory();
        Product product = sgFactory.newAnimal();
        product.show();
        Product product1 = sgFactory.newFruit();
        product1.show();

        AbstractFactory srFactory = new SRFactory();
        Product product2 = srFactory.newFruit();
        product2.show();
        Product product3 = srFactory.newAnimal();
        product3.show();
    }
}
