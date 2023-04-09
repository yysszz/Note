package springsourcecode.designpatterns.chainsofresponsibility.exp2;

import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 规则拦截对象
 */
@Component
@Order(4)
public class CheckRuleFilterObject extends AbstractHandler {

    @Override
    void doFilter(Request request, Response response) {
        System.out.println("规则拦截校验");
    }
}
