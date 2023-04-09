package springsourcecode.designpatterns.observer.exampleringbell;

public class TeacherListener implements BellEventListener {
    @Override
    public void heardBell(RingEvent e) {
        System.out.println(e.getSound() ? "老师上课了":"老师下课了");
    }
}
