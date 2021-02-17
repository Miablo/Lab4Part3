import javax.swing.*;
import java.awt.*;
import java.awt.event.AWTEventListener;

public class MyAWTEventListener implements AWTEventListener {
    @Override
    public void eventDispatched(AWTEvent event) {
       // System.out.println(event);
        Object o = event.getSource();
        if(o instanceof JTextField){
            JTextField jtf = (JTextField) o;
            jtf.setText("87");

        }
    }
}
