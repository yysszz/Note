package springsourcecode.designpatterns.simplefactory;

public class SimpleFactory {
    static final String PRODUCT_A = "productA";
    static final String PRODUCT_B = "productB";
    public static Product createProduct(String sign){
        switch (sign){
            case PRODUCT_A:
                return new ProductA();
            case PRODUCT_B:
                return new ProductB();
            default:
                return null;
        }
    }
}
