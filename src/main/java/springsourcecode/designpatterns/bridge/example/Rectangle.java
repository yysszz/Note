package springsourcecode.designpatterns.bridge.example;

public class Rectangle extends Shape {
    @Override
    public void draw() {
        color.bepaint("长方形");
    }
}
