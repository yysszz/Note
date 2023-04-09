package springsourcecode.designpatterns.observer.exampleringbell;

public class StudentListener implements BellEventListener {
    @Override
    public void heardBell(RingEvent e) {
        System.out.println(e.getSound() ? "学生上课了":"学生下课了");
    }
}
