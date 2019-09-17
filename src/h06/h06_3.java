package h06;

import java.applet.Applet;
import java.awt.*;

public class h06_3 extends Applet {

    int getal;
    public void init() {

        getal = 2147483647;



        //Format
        setSize(800,800);
        setBackground(Color.WHITE);

    }

    //wat je ziet op het scherm
    public void paint (Graphics g) {

       g.drawString("Het antwoord is " + getal*2,20,20);



    }
}