package springsourcecode.designpatterns.builder.example;

public class ConcreteDecorator2 extends Decorator {
    @Override
    void buildTV() {
        parlour.setTV("2TV");
        System.out.println("2建造TV");
    }

    @Override
    void buildSofa() {
        parlour.setSofa("2sofa");
        System.out.println("2建造沙发");
    }

    @Override
    void buildWall() {
        parlour.setWall("2wall");
        System.out.println("2建造墙");
    }


    public ConcreteDecorator2(){
        super.name = "2";
    }
}
