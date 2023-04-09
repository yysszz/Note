package springsourcecode.designpatterns.builder.example;

import springsourcecode.designpatterns.decorator.Component;

public class ConcreteDecorator1 extends Decorator {

    @Override
    void buildTV() {
        parlour.setTV("1TV");
        System.out.println("1建造TV");
    }

    @Override
    void buildSofa() {
        parlour.setSofa("1sofa");
        System.out.println("1建造沙发");
    }

    @Override
    void buildWall() {
        parlour.setTV("1wall");
        System.out.println("1建造墙");
    }

    public ConcreteDecorator1(Component component){
        super.name = "1";
    }
}
