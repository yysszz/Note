package springsourcecode.designpatterns.strategy.example1;

import com.google.common.collect.Maps;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class StrategyUseService implements ApplicationContextAware {

    private Map<String, IFileStrategy> iFileStrategyMap = Maps.newHashMap();

    public void resolve(String iFlleTypeEnum,Object objectParam){
        IFileStrategy currentIFileStrategy = iFileStrategyMap.get(iFlleTypeEnum);
        if (currentIFileStrategy != null) {
            currentIFileStrategy.resolve(objectParam);
        }
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Map<String, IFileStrategy> tempMap = applicationContext.getBeansOfType(IFileStrategy.class);
        tempMap.values().forEach(iFileStrategy -> iFileStrategyMap.put(iFileStrategy.gainFileType(),iFileStrategy)
        );
    }
}
