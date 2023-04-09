package springsourcecode.designpatterns.bridge.example;

public class Circle extends Shape {
    @Override
    public void draw() {
        color.bepaint("圆形");
    }
}
