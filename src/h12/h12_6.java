package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class h12_6 extends Applet {

    boolean gevonden;
    TextField tekstvak;
    Button knop;
    String s;
    String s2;
    int[] getal;
    int zoeken;
    int aantal;

    public void init() {

        setSize(500,500);

        getal = new int[20];
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener(new OkknopListener());
        knop = new Button("OK");
        knop.addActionListener(new OkknopListener());
        s = "";
        add(tekstvak);
        add(knop);
        zoeken = 0;

        for (int i = 0; i < getal.length; i++) {
            getal[i] = (int)(Math.random() * 10 + 1);
        }
    }
    public void paint(Graphics g) {
        int y = 50;

        for (int i = 0; i < getal.length; i++) {
            g.drawString(getal[i] + "", 50, y);
            y += 15;
        }
        g.drawString(s, 150, 80);
        g.drawString("De waarde komt " + aantal + "x voor", 150, 100);
    }
    class OkknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            boolean gevonden = false;
            zoeken = Integer.parseInt(tekstvak.getText());
            for (int i = 0; i < getal.length; i++) {
                if (getal[i] == zoeken){
                    gevonden =  true;
                    aantal++;
                    s = getal[i] + " gevonden";
                    s2 = "De waarde komt " + aantal + "x voor";
                }
                if (!gevonden){
                    s = zoeken + " is niet gevonden";
                }
            }
            repaint();
        }
    }

}
