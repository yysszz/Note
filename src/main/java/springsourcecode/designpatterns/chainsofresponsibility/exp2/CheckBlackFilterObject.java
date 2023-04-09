package springsourcecode.designpatterns.chainsofresponsibility.exp2;

import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 黑名单校验对象
 */
@Component
@Order(3)
public class CheckBlackFilterObject extends AbstractHandler{

    @Override
    void doFilter(Request request, Response response) {
        System.out.println("校验黑名单");
    }
}
