package h04;

import java.applet.Applet;
import java.awt.*;

public class h04_7 extends Applet {


    public void init() {

        setSize(600, 600);
        setBackground(Color.white);

    }
    public void paint (Graphics g){
        //Dobbelsteen
        g.drawRoundRect(40,40,90,90,25,60);

        //Bol 1
        g.fillOval(55,50,25,25);

        //Bol 2
        g.fillOval(93,50,25,25);

        //Bol 3
        g.fillOval(55,93,25,25);

        //Bol 4
        g.fillOval(93,93,25,25);

    }

}