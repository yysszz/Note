package springsourcecode.designpatterns.decorator;

public class ConcreComponent extends Component {

    @Override
    public void exec() {
        super.setCost(5);
        System.out.println("基本价5块:" + 5);
    }
}
