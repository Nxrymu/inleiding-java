package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class h10_PO extends Applet {
    TextField tekstvak;
    int cijfer;
    String antwoord;
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
            g.drawString(antwoord + "", 50,80);
        }

    }

    public class tekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            cijfer = Integer.parseInt(tekstvak.getText());
            teGroot = false;
            if (cijfer>3) {
                antwoord = "onvoldoende";
            }else {
                antwoord = "slecht";
            }if (cijfer>4) {
                antwoord = "matig";
            }if (cijfer>5) {
                antwoord = "voldoende";
            }else if (cijfer==5) {
                antwoord = "matig";
            }if (cijfer>7) {
                antwoord = "goed";
            }if (cijfer>10) {
                teGroot = true;
                antwoord = "Het cijfer kan niet groter dan 10.";
            }
            repaint();

        }

    }
}