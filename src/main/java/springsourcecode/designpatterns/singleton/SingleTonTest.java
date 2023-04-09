package springsourcecode.designpatterns.singleton;

public enum SingleTonTest {
    instanceA("A","15"),instanceB("B","15");

    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    SingleTonTest(String name, String age) {
        this.name = name;
        this.age = age;
    }
}
