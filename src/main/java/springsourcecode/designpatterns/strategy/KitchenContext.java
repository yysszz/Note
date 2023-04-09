package springsourcecode.designpatterns.strategy;

public class KitchenContext {


    private CookStrategy cookStrategy;

    public CookStrategy getCookStrategy() {
        return cookStrategy;
    }

    public void setCookStrategy(CookStrategy cookStrategy) {
        this.cookStrategy = cookStrategy;
    }

    public void exeStrategyMethod(){
        cookStrategy.StrategyMethod();
    }
}
