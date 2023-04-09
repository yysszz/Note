package springsourcecode.designpatterns.bridge.example;

public class Square extends Shape {
    @Override
    public void draw() {
        color.bepaint("正方形");
    }
}
