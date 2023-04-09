package springsourcecode.designpatterns.chainsofresponsibility;

public class BigTeacher extends Leader{

    @Override
    public void handleRequest(int leaveDays) {
        if(leaveDays <= Leader.BIG_TEACHER_LEAVE_DAYS){
            System.out.println("系主任处理请假请求，请假了" + leaveDays + "天");
        }else {
            if (getNext() != null){
                getNext().handleRequest(leaveDays);
            }else {
                System.out.println("无人处理");
            }
        }
    }
}
