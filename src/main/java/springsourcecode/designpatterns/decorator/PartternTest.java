package springsourcecode.designpatterns.decorator;

public class PartternTest {

    public static void main(String[] args) {
        Component component = new ConcreComponent();
        //第一次装饰
        component = new ConcreDecorator1(component);
        //第二次装饰
//        component = new ConcreDecorator2(component);

        component.exec();

    }
}
