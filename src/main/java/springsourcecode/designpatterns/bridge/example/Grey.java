package springsourcecode.designpatterns.bridge.example;

public class Grey implements Color {
    @Override
    public void bepaint(String shape) {
        System.out.println("灰色的" + shape);
    }
}
