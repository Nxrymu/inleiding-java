package h05;

import java.applet.Applet;
import java.awt.*;

public class h05_2 extends Applet {
    int GewichtJeroen;
    int GewichtHans;
    int GewichtValerie;
    int HoogteXas;

    public void init() {
        HoogteXas=360;

        setSize(600, 600);
        setBackground(Color.WHITE);
        GewichtJeroen=100;
        GewichtHans=80;
        GewichtValerie=40;

    }
    public void paint (Graphics g){

        //verticale lijn
        g.drawLine(139, HoogteXas, 139, 250);

        //hoeveelheden
        g.drawString("0",110,365);
        g.drawString("20",110,345);
        g.drawString("40",110,325);
        g.drawString("60",110,305);
        g.drawString("80",110,285);
        g.drawString("100",110,265);

        //Personen
        g.drawString("jeroen",190,375);
        g.drawString("Valerie",240,375);
        g.drawString("Hans",140,375);

        //horizontale lijn
        g.drawLine(350, HoogteXas,140,HoogteXas);

        //Roze Balk
        g.setColor(Color.PINK);
        g.fillRect(190,HoogteXas - GewichtJeroen,50,GewichtJeroen);
        //Oranje Balk
        g.setColor(Color.ORANGE);
        g.fillRect(140,HoogteXas - GewichtHans,50,GewichtHans);
        //Grijze Balk
        g.setColor(Color.GRAY);
        g.fillRect(240,HoogteXas - GewichtValerie,50,GewichtValerie);


    }

}


