package springsourcecode.designpatterns.builder.example;

public class Client {
    public static void main(String[] args) {
        Decorator decorator1 = new ConcreteDecorator2();
        ProjectManager projectManager = new ProjectManager(decorator1);
        Parlour parlour = projectManager.construct();
        parlour.show(decorator1.getName());
        System.out.println(parlour.toString());
    }
}
