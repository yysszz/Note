package springsourcecode.designpatternnote.chapter45_factory;

public interface ApplicationContext {
    Object getBean(String beanId);
}
