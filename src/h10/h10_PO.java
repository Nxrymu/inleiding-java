package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class h10_PO extends Applet {
    TextField tekstvak;
    int cijfer;
    String antwoordTekst;
    boolean teGroot;


    public void init(){
        setSize(500,500);

        cijfer = 0;

        tekstvak = new TextField("",20);
        tekstvak.addActionListener(new tekstvakListener());
        add(tekstvak);

    }
    public void paint(Graphics g){
        if (teGroot=true){
            g.drawString(antwoordTekst + "", 50,80);
        }

    }

    public class tekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            cijfer = Integer.parseInt(tekstvak.getText());
            teGroot = false;
            if (cijfer>3) {
                antwoordTekst = "onvoldoende";
            }else {
                antwoordTekst = "slecht";
            }if (cijfer>4) {
                antwoordTekst = "matig";
            }if (cijfer>5) {
                antwoordTekst = "voldoende";
            }else if (cijfer==5) {
                antwoordTekst = "matig";
            }if (cijfer>7) {
                antwoordTekst = "goed";
            }if (cijfer>10) {
                teGroot = true;
                antwoordTekst = "Het cijfer kan niet groter dan 10.";
            }
            repaint();

        }

    }
}