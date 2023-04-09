package springsourcecode.designpatterns.builder;

public class ConcretBuilder extends Builder{


    @Override
    public void buildA() {
        System.out.println("组建A");
    }

    @Override
    public void buildB() {
        System.out.println("组建B");
    }

    @Override
    public void buildC() {
        System.out.println("组建C");
    }
}
