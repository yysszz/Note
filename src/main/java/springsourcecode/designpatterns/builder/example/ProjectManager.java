package springsourcecode.designpatterns.builder.example;

public class ProjectManager {

    private Decorator decorator;

    public ProjectManager(Decorator decorator){
        this.decorator = decorator;
    }

    public Parlour construct(){
        decorator.buildSofa();
        decorator.buildTV();
        decorator.buildWall();
        return decorator.getResult();
    }

}
