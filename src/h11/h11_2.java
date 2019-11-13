package h11;

import java.applet.Applet;
import java.awt.*;

public class h11_2 extends Applet {

    public void init(){

        setSize(300,300);

    }

    public void paint(Graphics g) {
        int teller;
        int y = 20;

        for (teller = 20; teller > 9; teller--) {
            y += 20;
            g.drawString("" + teller, 50, y);
        }
    }

}
