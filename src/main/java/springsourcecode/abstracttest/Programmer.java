package springsourcecode.abstracttest;

public class Programmer extends Human {
    @Override
    public void say() {

    }

    public static void main(String[] args) {
        Human human = new Programmer();
        human.action();
    }
}
