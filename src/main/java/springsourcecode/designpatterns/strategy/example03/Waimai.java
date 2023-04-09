package springsourcecode.designpatterns.strategy.example03;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Waimai extends AbstractStrategy implements Strategy {

    private static final Waimai instance = new Waimai();

    @Resource(name = "waimaiService")
    private WaimaiService waimaiService;

    private Waimai(){
        register();
    }

    public static Waimai getInstance(){
        return instance;
    }

    @Override
    public void issue(Object... param) {
        WaimaiRequest waimaiRequest = new WaimaiRequest();
        waimaiRequest.setWaimaiParam(param);
        waimaiService.issueWaimai(waimaiRequest);
    }
}
