package h06;

import java.applet.Applet;
import java.awt.*;

public class h06_1 extends Applet {

    int Totaalbedrag;
    int Verdeelbedrag;

    public void init() {

        Totaalbedrag = 113;
        Verdeelbedrag = 4;

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
        g.drawString("Jan",180,240);
        g.drawString("Ali",180,270);
        g.drawString("Jeanette",180,300);
        g.drawString("Jayron",180,330);

        //Totaal bedrag
        g.drawString("€"+Totaalbedrag,300,240);

        //onderscheidinglijn
        g.drawLine(235,340,235,225);

        //onderscheidingslijn 2
        g.drawLine(290,340,290,225);

        //Alle bedragen
        g.drawString("€"+Totaalbedrag/Verdeelbedrag,245,240);
        g.drawString("€"+Totaalbedrag/Verdeelbedrag,245,270);
        g.drawString("€"+Totaalbedrag/Verdeelbedrag,245,300);
        g.drawString("€"+Totaalbedrag/Verdeelbedrag,245,330);

    }
}