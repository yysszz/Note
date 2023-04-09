package springsourcecode.designpatterns.decorator;

public abstract class Component {

    private   int cost = 0;

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public abstract void exec();
}
