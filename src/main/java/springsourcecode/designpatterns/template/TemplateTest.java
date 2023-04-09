package springsourcecode.designpatterns.template;

public class TemplateTest extends Template{


    @Override
    void operation1() {

    }

    @Override
    void operation3() {

    }

    /**
     * 重写钩子方法
     */
    @Override
    public void operation2() {

    }

    @Override
    void templateExcute() {
        operation1();
        operation2();
        operation3();
    }
}
