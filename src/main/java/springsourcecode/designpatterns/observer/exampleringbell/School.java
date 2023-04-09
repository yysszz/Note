package springsourcecode.designpatterns.observer.exampleringbell;

public class School {

    public static void main(String[] args) {
        BellEventSource bellEventSource = new BellEventSource();
        bellEventSource.addPersonalListener(new StudentListener());
        bellEventSource.addPersonalListener(new TeacherListener());

        bellEventSource.addPersonalListener((event) -> {
            System.out.println(event.getSound()?"上课了":"下课了");
        });





        bellEventSource.ring(true);

    }
}
