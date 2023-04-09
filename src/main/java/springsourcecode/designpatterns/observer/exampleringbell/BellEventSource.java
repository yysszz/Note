package springsourcecode.designpatterns.observer.exampleringbell;

import com.google.common.collect.Lists;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class BellEventSource {

    private List<BellEventListener> listeners;

    public BellEventSource(){
        listeners = Lists.newArrayList();
    }

    public void addPersonalListener(BellEventListener bellEventListener){
        listeners.add(bellEventListener);
    }

    public void ring(boolean sound){
        String ringType = sound ? "上课铃":"下课铃";
        System.out.println(ringType + "响了");
        RingEvent ringEvent = new RingEvent(this,sound);
        notifies(ringEvent);
    }

    protected void notifies(RingEvent ringEvent) {
        BellEventListener listener = null;
        Iterator<BellEventListener> iterator = listeners.iterator();
        while (iterator.hasNext()){
            TimeUnit unit;
            BlockingQueue workQueue;
            listener = iterator.next();
            listener.heardBell(ringEvent);
        }
    }
}
