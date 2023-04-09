package springsourcecode.designpatterns.chainsofresponsibility.exp2;

import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 安全校验对象
 */
@Component
@Order(2)
public class CheckSecurityFilterObject extends AbstractHandler {

    @Override
    void doFilter(Request request, Response response) {
        System.out.println("安全调用校验");
    }

}
