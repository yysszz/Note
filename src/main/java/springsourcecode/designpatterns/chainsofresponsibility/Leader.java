package springsourcecode.designpatterns.chainsofresponsibility;

public abstract class Leader {

    public static final int TEACHER_LEAVE_DAYS = 2;
    public static final int BIG_TEACHER_LEAVE_DAYS = 7;
    public static final int DEAN_LEAVE_DAYS = 10;

    private Leader next;

    public Leader getNext() {
        return next;
    }

    public void setNext(Leader next) {
        this.next = next;
    }

    public abstract void handleRequest(int leaveDays);
}
