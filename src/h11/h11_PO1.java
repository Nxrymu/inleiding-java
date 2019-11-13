package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class h11_PO1 extends Applet {

    TextField tekstvak;
    Label label;
    Button okknop;
    String s;
    int cijfer;

    public void init() {
        tekstvak = new TextField("", 20);
        tekstvak.addActionListener( new OkknopListener());
        label = new Label("Typ een cijfer tussen 1 en 10 in.");
        okknop = new Button("OK");
        okknop.addActionListener( new OkknopListener());
        add(label);
        add(tekstvak);
        add(okknop);

        s = "";
        cijfer = 0;

    }
    public void paint(Graphics g) {
        int teller;
        int x = 70;
        int y = 80;


        for(teller = 1; teller <= 10; teller++){

            g.drawString(teller + " x "+ cijfer + " = " + teller * cijfer, x, y);
            y += 20;
        }
    }
    class OkknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            cijfer = Integer.parseInt(s);
            tekstvak.setText("");
            repaint();
        }
    }
}


