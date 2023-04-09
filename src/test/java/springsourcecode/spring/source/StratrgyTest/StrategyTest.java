package springsourcecode.spring.source.StratrgyTest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import springsourcecode.designpatterns.strategy.example1.StrategyUseService;
import springsourcecode.SpringSourceCodeApplication;

@SpringBootTest(classes = {SpringSourceCodeApplication.class})
@ActiveProfiles("test")
public class StrategyTest {


    @Autowired
    public StrategyUseService strategyUseService;


    @Test
    public void test(){
        strategyUseService.resolve(".xls","参数");
    }
}
