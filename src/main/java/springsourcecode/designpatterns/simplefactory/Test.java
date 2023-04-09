package springsourcecode.designpatterns.simplefactory;

public class Test {
    public static void main(String[] args) {

        Product productA = SimpleFactory.createProduct("productA");
        Product productB = SimpleFactory.createProduct("productB");
        productA.show();
        System.out.println();
        productB.show();
    }
}
