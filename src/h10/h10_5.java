package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class h10_5 extends Applet {
    TextField tekstvak;
    Label label;
    Button okKnop;

    String uitslag;
    String welniet;
    double cijfer;
    double totaal;
    int aantal;
    Boolean geklikt;

    public void init(){

        setSize(500,500);

        cijfer = 0.0;
        uitslag = "";

        okKnop = new Button("Ok");
        okKnop.addActionListener(new OkKnopListener());
        add(okKnop);
        label = new Label("Type een cijfer zonder decimaal in en druk op enter.");
        tekstvak = new TextField("",20);
        tekstvak.addActionListener(new TekstvakListener());
        welniet = "";
        geklikt = false;
        //-------------------
        add(label);
        add(tekstvak);

    }

    public void paint(Graphics g){

        g.drawString("Cijfer " + cijfer + " is " + uitslag,50,90);
        if (geklikt==true){
            g.drawString("Het gemmiddelde cijfer is" +  ( totaal/aantal ),50,110);
            g.drawString("De student is " + welniet + " geslaagd", 50, 130 );
        }



    }

    public class OkKnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            geklikt = true;

            double gemiddelde = totaal/aantal;
            if (gemiddelde<5.5){
                welniet="niet";
            }else {
                welniet="wel";
            }
            repaint();

        }
    }

    public class TekstvakListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            geklikt = false;
            cijfer = Double.parseDouble(tekstvak.getText());
            if (cijfer<5.5){
                uitslag = "Onvoldoende";
            }else {
                uitslag ="Voldoende";

            }
            totaal = totaal+cijfer;
            aantal++;

            repaint();
        }
    }

}