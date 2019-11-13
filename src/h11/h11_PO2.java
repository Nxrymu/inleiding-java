package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class h11_PO2 extends Applet {

    Label label;
    Button okknop;
    int cijfer;

    public void init() {
        label = new Label("Klik op ok.");
        okknop = new Button("ok");
        okknop.addActionListener( new OkknopListener());
        add(label);
        add(okknop);
        cijfer = 0;

    }
    public void paint(Graphics g) {
        int teller;
        int x = 50;
        int y = 80;


        for(teller = 1; teller <= 10; teller++){

            g.drawString(teller + " x "+ cijfer + " = " + teller * cijfer, x, y);
            y += 20;
        }
    }
    class OkknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            cijfer++;
            repaint();
        }
    }
}

