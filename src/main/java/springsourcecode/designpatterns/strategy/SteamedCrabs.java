package springsourcecode.designpatterns.strategy;

public class SteamedCrabs implements CookStrategy {
    @Override
    public void StrategyMethod() {
        System.out.println("清蒸大闸蟹");
    }
}
