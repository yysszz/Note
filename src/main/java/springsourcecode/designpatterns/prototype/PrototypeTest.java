package springsourcecode.designpatterns.prototype;

public class PrototypeTest implements Cloneable{

    PrototypeTest() {
        System.out.println("原型创建成功");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("原型克隆成功");
        return (PrototypeTest) super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        PrototypeTest prototypeTest1 = new PrototypeTest();
        PrototypeTest prototypeTest2 = (PrototypeTest) prototypeTest1.clone();
        System.out.println(prototypeTest1 == prototypeTest2);
    }
}
