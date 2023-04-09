package springsourcecode.designpatterns.strategy.example2;

import com.google.common.collect.Maps;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Map;
import java.util.function.Function;

@Service
public class QueryGrantTypeService {

    @Resource
    private  GrantTypeService grantTypeService;
    private Map<String , Function<String,String>> grantTypeMap = Maps.newHashMap();

    @PostConstruct
    public void dispatchInit(){
        grantTypeMap.put("红包",resourceId -> grantTypeService.redPaper(resourceId));
        grantTypeMap.put("购物",resourceId -> grantTypeService.shopping(resourceId));
        grantTypeMap.put("会员",resourceId -> grantTypeService.QQVip(resourceId));
    }

    public String getResult(String resourceType,String resourceId){
        Function<String, String> result = grantTypeMap.get(resourceType);
        if (result != null) {
            return result.apply(resourceId);
        }
        return "查找不到该优惠券！";
    }
}
