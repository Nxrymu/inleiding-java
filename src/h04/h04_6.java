package h04;

import java.applet.Applet;
import java.awt.*;

public class h04_6 extends Applet {


    public void init() {

        setSize(600, 600);
        setBackground(Color.white);

    }
    public void paint (Graphics g){

        //Stoplicht
        g.setColor(Color.DARK_GRAY);
        g.fillRoundRect(40,40,85,180,25,60);

        //Eerste licht
        g.setColor(Color.GREEN);
        g.fillOval(60,50,45,45);

        //Tweede licht
        g.setColor(Color.ORANGE);
        g.fillOval(60,100,45,45);

        //Derde licht
        g.setColor(Color.RED);
        g.fillOval(60,150,45,45);

    }

}