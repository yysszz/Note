package springsourcecode.designpatternnote.chapter16;

import com.google.common.collect.Lists;

import java.util.List;

public class Alert {
    private List<AlertHandler> alertHandlers = Lists.newArrayList();

    public void addHandler(AlertHandler alertHandler){
        this.alertHandlers.add(alertHandler);
    }

    public void check(ApiStateInfo apiStateInfo){
        for (AlertHandler handler : alertHandlers) {
            handler.check(apiStateInfo);
        }
    }
}
