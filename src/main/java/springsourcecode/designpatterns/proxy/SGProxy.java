package springsourcecode.designpatterns.proxy;

public class SGProxy implements Specialty {

    private SGSpecialty sgSpecialty;
    @Override
    public void display() {
        if(null == sgSpecialty){
            sgSpecialty = new SGSpecialty();
        }
        preDisplay();
        sgSpecialty.display();
        aftDisplay();
    }

    private void aftDisplay() {
        System.out.println("韶关代理前");
    }

    private void preDisplay() {
        System.out.println("韶关代理后");
    }
}
