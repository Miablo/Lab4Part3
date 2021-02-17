import javax.swing.*;
import java.awt.*;
import java.awt.event.AWTEventListener;

public class MyAWTEventListener implements AWTEventListener {
    int test;
    @Override
    public void eventDispatched(AWTEvent event) {
        //System.out.println(event.paramString());
        Object o = event.getSource();
        int ID = event.getID();
        //System.out.println("Event ID: " + ID);
        if(ID == 500) {
            if(o instanceof JTextField){
                JTextField jtf = (JTextField) o;
                jtf.setText("87");
                if(jtf.getY() >= 175){
                    test = Integer.parseInt(jtf.getText());
                }
            }else if(o instanceof  JButton){
                if(test == 0) {
                    System.out.println("Pass");
                }else{
                    System.out.println("Falied");
                }
            }
        }

    }
}
