package springsourcecode.designpatterns.decorator;

public abstract class Decorator extends Component {

    private Component component = null;

    public Decorator(Component component){
        this.component = component;
    }

    @Override
    public void exec(){
        this.component.exec();
    }

}
