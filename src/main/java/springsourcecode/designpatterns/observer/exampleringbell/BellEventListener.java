package springsourcecode.designpatterns.observer.exampleringbell;

import java.util.EventListener;

interface BellEventListener extends EventListener {

    public void heardBell(RingEvent e);
}
