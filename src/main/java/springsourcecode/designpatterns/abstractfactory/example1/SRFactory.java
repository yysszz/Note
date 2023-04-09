package springsourcecode.designpatterns.abstractfactory.example1;

public class SRFactory implements AbstractFactory {


    @Override
    public Product newAnimal() {
        return new SRcowProduct();
    }

    @Override
    public Product newFruit() {
        return new SRappleProduct();
    }
}
