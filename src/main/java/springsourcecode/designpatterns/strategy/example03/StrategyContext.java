package springsourcecode.designpatterns.strategy.example03;

import com.google.common.collect.Maps;

import java.util.HashMap;

public class StrategyContext {

    private final static HashMap<String, Strategy> registerMap = Maps.newHashMap();

    public static void registerStrategy(String rewardType,Strategy strategy){
        registerMap.putIfAbsent(rewardType,strategy);
    }

    public Strategy getStrategy(String rewardType){
        return registerMap.get(rewardType);
    }
}
