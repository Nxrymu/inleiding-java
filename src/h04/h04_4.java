package h04;

import java.applet.Applet;
import java.awt.*;

public class h04_4 extends Applet {


        public void init() {

            setSize(600, 600);
            setBackground(Color.WHITE);

        }
        public void paint (Graphics g){

            //verticale lijn
            g.drawLine(140, 250, 140, 90);

            //hoeveelheden
            g.drawString("0",110,250);
            g.drawString("20",110,220);
            g.drawString("40",110,190);
            g.drawString("60",110,162);
            g.drawString("80",110,135);
            g.drawString("100",110,100);

            //Personen
            g.drawString("jeroen",190,270);
            g.drawString("Valerie",240,270);
            g.drawString("Hans",140,270);

            //horizontale lijn
            g.drawLine(350,250,140,250);

            //Roze Balk
            g.setColor(Color.PINK);
            g.fillRect(190,90,50,160);
            //Oranje Balk
            g.setColor(Color.ORANGE);
            g.fillRect(140,130,50,120);
            //Grijze Balk
            g.setColor(Color.GRAY);
            g.fillRect(240,185,50,65);


        }

    }


