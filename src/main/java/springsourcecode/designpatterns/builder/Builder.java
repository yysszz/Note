package springsourcecode.designpatterns.builder;

public abstract class Builder {

    protected Product product = new Product();

    abstract void buildA();

    abstract void buildB();

    abstract void buildC();

    public Product getResult(){
        return product;
    }
}
