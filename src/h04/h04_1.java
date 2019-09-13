package h04;

import java.applet.Applet;
import java.awt.*;

public class h04_1 extends Applet {

    public void init(){

        setBackground(Color.white);
        setSize(500,500);

    }

    public void paint(Graphics g){

        g.drawLine(70, 120, 120, 120);
        g.drawLine(70, 120, 95, 95);
        g.drawLine(95, 95, 120, 120);


    }


}
