package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class h12_3 extends Applet {

    TextField[] tekstvak;
    Button knop;
    double[] input;

    public void init() {
        tekstvak = new TextField[5];
        input = new double[5];
        knop = new Button("OK");
        knop.addActionListener(new KnopListener());

        for (int i = 0; i < tekstvak.length; i++) {
            tekstvak[i] = new TextField("", 5);
            add(tekstvak[i]);
            add(knop);
        }
    }
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            for (int i = 0; i < tekstvak.length; i++) {
                input[i] = Double.parseDouble(tekstvak[i].getText());
            }
            Arrays.sort(input);
            for (int i = 0; i < tekstvak.length; i++) {
                tekstvak[i].setText(String.valueOf(input[i]));
            }
            repaint();
        }
    }

}
