package springsourcecode.designpatterns.chainsofresponsibility;

public class Teacher extends Leader {

    @Override
    public void handleRequest(int leaveDays) {
        if(leaveDays <= Leader.TEACHER_LEAVE_DAYS){
            System.out.println("辅导员处理请假请求，请假了" + leaveDays + "天");
        }else {
            if (getNext() != null){
                getNext().handleRequest(leaveDays);
            }else {
                System.out.println("无人处理");
            }
        }
    }
}
