package springsourcecode.designpatterns.chainsofresponsibility;

public class Student {

    public static void main(String[] args) {
        Leader teacher = new Teacher();
        Leader bigTeacher = new BigTeacher();
        Leader dean = new Dean();
        teacher.setNext(bigTeacher);
        bigTeacher.setNext(dean);


        teacher.handleRequest(6);
    }
}
