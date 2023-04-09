package springsourcecode.designpatterns.strategy.example03;

public abstract class AbstractStrategy implements Strategy{


    public void register(){
        StrategyContext.registerStrategy(getClass().getSimpleName(),this);
    }

}
