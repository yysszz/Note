package springsourcecode.designpatterns.strategy.example2;

public class GrantTypeService {

    public String redPaper(String resourceId){
        return "红包类型";
    }

    public String shopping(String resourceId){
        return "购物类型";
    }

    public String QQVip(String resourceId){
        return  "会员";
    }

}
