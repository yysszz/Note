package springsourcecode.designpatterns.builder;

public class Product {

    private String A;
    private String B;
    private String C;

    public void setA(String a) {
        A = a;
    }

    public void setB(String b) {
        B = b;
    }

    public void setC(String c) {
        C = c;
    }

    public void show(){
        System.out.println("展示产品");
    }
}
