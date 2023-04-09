package springsourcecode.designpatternnote.chapter45_factory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BeanDefinition {

    private String id;
    private String className;
    private List<ConstructorArg> constructorArgs = new ArrayList<>();
    private Scope scope = Scope.SINGLETON;
    private boolean lazyInit = false;

    public static enum Scope{
        SINGLETON,
        PROTOTYPE;
    }

    public boolean isSingleton(){
        return scope.equals(Scope.SINGLETON);
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class  ConstructorArg {
        private boolean isRef;
        private Class type;
        private Object arg;

    }
}
