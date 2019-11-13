package h12;

import java.applet.Applet;
import java.awt.*;

public class h12_1 extends Applet {

    double cijfer[];
    double a;

    public void init() {
        cijfer = new double[10];

        for(int teller = 0; teller < cijfer.length; teller++){
            cijfer[teller] =  teller + 10;
            a += cijfer[teller];
        }
        a /= cijfer.length;
    }
    public void paint(Graphics g) {
        for(int teller = 0; teller < cijfer.length; teller++) {
            g.drawString("" + cijfer[teller], 50, 20 * teller + 20);
        }
        g.drawString("" + a, 120, 20);
    }
}
