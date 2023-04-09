package springsourcecode.designpatterns.builder;

public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public Product Construct(){
        builder.buildA();
        builder.buildB();
        builder.buildC();
        return builder.getResult();
    }
}
