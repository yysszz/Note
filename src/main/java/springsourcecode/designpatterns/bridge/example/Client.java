package springsourcecode.designpatterns.bridge.example;

public class Client {

    public static void main(String[] args) {
         Shape circle = new Circle();
         circle.setColor(new White());
         circle.draw();


    }
}
