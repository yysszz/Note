package springsourcecode.designpatterns.decorator;

public class ConcreDecorator2 extends Decorator {

    public ConcreDecorator2(Component component) {
        super(component);
    }

    @Override
    public void exec() {
        this.decorate();
        super.exec();
    }

    private void decorate(){
        super.setCost(super.getCost() + 2);
        System.out.println("加辣条2块:" + 7);
    }
}
