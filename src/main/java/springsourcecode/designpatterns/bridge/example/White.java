package springsourcecode.designpatterns.bridge.example;

public class White implements Color {
    @Override
    public void bepaint(String shape) {
        System.out.println("白色的" + shape);
    }
}
