package springsourcecode.designpatterns.strategy;

public class StratefgyTest {
    public static void main(String[] args) {
        KitchenContext kitchenContext = new KitchenContext();
        //清蒸
        CookStrategy cookStrategy = new SteamedCrabs();
        kitchenContext.setCookStrategy(cookStrategy);
        kitchenContext.exeStrategyMethod();
        //红烧
        CookStrategy braisedCrabs = new BraisedCrabs();
        kitchenContext.setCookStrategy(braisedCrabs);
        kitchenContext.exeStrategyMethod();
    }
}
