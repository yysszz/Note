package springsourcecode.designpatterns.builder;

public class Client {

    public static void main(String[] args) {
        Builder builder = new ConcretBuilder();
        Director director = new Director(builder);
        Product construct = director.Construct();
        construct.show();
    }
}
