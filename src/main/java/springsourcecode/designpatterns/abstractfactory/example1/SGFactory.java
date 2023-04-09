package springsourcecode.designpatterns.abstractfactory.example1;

public class SGFactory implements AbstractFactory{
    @Override
    public Product newAnimal() {
        return new SGhorseProduct();
    }

    @Override
    public Product newFruit() {
        return new SGbananaProduct();
    }
}
