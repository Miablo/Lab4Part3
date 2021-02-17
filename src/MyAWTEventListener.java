import javax.swing.*;
import java.awt.*;
import java.awt.event.AWTEventListener;

public class MyAWTEventListener implements AWTEventListener {
    @Override
    public void eventDispatched(AWTEvent event) {
       // System.out.println(event);
        Object o = event.getSource();
        int ID = event.getID();

        System.out.println("Event ID: " + ID);
       if(ID == 502 || ID == 501) {
           if(o instanceof JTextField){
               JTextField jtf = (JTextField) o;
               jtf.setText("87");

           }
       }

    }
}
