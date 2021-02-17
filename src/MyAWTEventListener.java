import java.awt.*;
import java.awt.event.AWTEventListener;

public class MyAWTEventListener implements AWTEventListener {
    @Override
    public void eventDispatched(AWTEvent event) {
        System.out.println(event);
    }
}
