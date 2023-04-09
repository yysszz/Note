package springsourcecode.designpatterns.adapter.classadapter;

public class ClsTest {

    public static void main(String[] args) {
        System.out.println("类适配器模式");
        Targer adapter = new Adapter();
        adapter.request();
    }
}
