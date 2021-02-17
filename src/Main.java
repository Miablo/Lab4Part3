import gui.MyGUI;

import java.awt.*;
import java.awt.event.AWTEventListener;

/**
 * Testing GUI
 *
 * @author Mio Diaz,
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        MyAWTEventListener listener = new MyAWTEventListener();
        tk.addAWTEventListener(listener, 0);
        MyGUI gui = new MyGUI();
        gui.setSize(400, 300);
        gui.setVisible(true);
    }
}
