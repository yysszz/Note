package springsourcecode.designpatterns.chainsofresponsibility.exp2;

import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 校验参数对象
 */
@Component
@Order(1)
public class CheckParamFilterObject extends AbstractHandler {

    @Override
    void doFilter(Request request, Response response) {
        System.out.println("非空参数校验");
    }

}
