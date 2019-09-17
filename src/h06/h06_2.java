package h06;

import java.applet.Applet;
import java.awt.*;

public class h06_2 extends Applet {

    int Minuut;
    int Uur;
    int Dag;
    int Jaar;

    public void init() {

        Minuut = 60;
        Uur = Minuut*60;
        Dag = Uur*24;
        Jaar = Dag*365;

        //Format
        setSize(800,800);
        setBackground(Color.BLACK);

    }

    //wat je ziet op het scherm
    public void paint (Graphics g) {

        g.setColor(Color.WHITE);


        //De tabel
        g.drawLine(350,250,180,250);
        g.drawLine(350,280,180,280);
        g.drawLine(350,310,180,310);

        //Personen
        g.drawString("In een uur zit " + Uur + " seconden",180,240);
        g.drawString("In een dag zit " + Dag + " uur",180,270);
        g.drawString("In een jaar zit " + Jaar + " jaar",180,300);



    }
}