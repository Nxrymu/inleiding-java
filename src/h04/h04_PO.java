package h04;

import java.applet.Applet;
import java.awt.*;

public class h04_PO extends Applet {



        public void init() {

            setSize(800,800);


        }

        public void paint(Graphics g) {
            //Verticale lijn
            g.drawLine(100,90,300,90);
            //lijn tekst
            g.drawString("Lijn", 100,105);
            //rechthoek
            g.drawRect(100, 110, 200, 100);
            //rechthoek tekst
            g.drawString("Rechthoek",100,225);
            //afgeronde rechthoek
            g.drawRoundRect(100, 235, 200, 100, 30, 30);
            //afgeronde rechthoek tekst
            g.drawString("Afgeronde rechthoek",100,355);
            //gevulde rechthoek met ovaal tekst
            g.drawString("Gevulde rechthoek met ovaal",320,225);
            //gevulde rechthoek
            g.setColor(Color.MAGENTA);
            g.fillRect(315, 110, 200, 100);
            //ovaal
            g.setColor(Color.BLACK);
            g.drawOval(315, 110, 200, 100);
            //gevulde ovaal
            g.setColor(Color.MAGENTA);
            g.fillOval(315, 235, 200, 100);
            //Gevulde ovaal tekst
            g.setColor(Color.BLACK);
            g.drawString("Gevulde ovaal",375,355);
            //taartpunt met ovaal eromheen
            g.setColor(Color.BLACK);
            g.drawArc(550,110,190,95,360,360);
            g.setColor(Color.MAGENTA);
            g.fillArc(560,110,180,95,360,40);
            //taartpunt met ovaal eromheen tekst
            g.setColor(Color.BLACK);
            g.drawString("Taartpunt met ovaal eromheen",550,225);
            //cirkel
            g.setColor(Color.BLACK);
            g.drawOval(595,235,100,100);
            //cirkel tekst
            g.drawString("Cirkel",630,355);



        }

    }





