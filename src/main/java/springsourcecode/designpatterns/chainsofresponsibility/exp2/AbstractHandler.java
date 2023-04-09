package springsourcecode.designpatterns.chainsofresponsibility.exp2;

import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;

/**
 * 抽象处理链
 */
public abstract class AbstractHandler {

    private AbstractHandler nextHandler;

    public void setNextHandler(AbstractHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * 执行当前责任并传递
     * @param request
     * @param response
     */
    public void filter(Request request, Response response) {
        doFilter(request,response);
        if (nextHandler != null) {
            getNextHandler().filter(request,response);
        }
    }

    public AbstractHandler getNextHandler(){
        return nextHandler;
    }

    /**
     * 执行当前的责任
     * @param request
     * @param response
     */
    abstract void doFilter(Request request, Response response);
}
