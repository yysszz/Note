package springsourcecode.designpatterns.chainsofresponsibility;

public class Dean extends Leader {

    @Override
    public void handleRequest(int leaveDays) {
        if(leaveDays <= Leader.DEAN_LEAVE_DAYS){
            System.out.println("院长处理请假请求，请假了" + leaveDays + "天");
        }else {
            if (getNext() != null){
                getNext().handleRequest(leaveDays);
            }else {
                System.out.println("无人处理");
            }
        }
    }
}
