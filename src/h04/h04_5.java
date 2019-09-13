package h04;

import java.applet.Applet;
import java.awt.*;

public class h04_5 extends Applet {


    public void init() {

        setSize(600, 600);
        setBackground(Color.BLUE);

    }
    public void paint (Graphics g){

        g.setColor(Color.YELLOW);
        g.drawArc(200,200,120,70,360,360);
        g.fillArc(200,200,120,70,95,40);


    }

}