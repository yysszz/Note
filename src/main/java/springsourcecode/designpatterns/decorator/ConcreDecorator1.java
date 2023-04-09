package springsourcecode.designpatterns.decorator;

public class ConcreDecorator1 extends Decorator {


    public ConcreDecorator1(Component component) {
        super(component);
    }

    private void decorate(){
        super.setCost(super.getCost() + 3);
        System.out.println("加肉肠3块:" + 8);
    }

    @Override
    public void exec(){
        this.decorate();
        super.exec();
    }
}
