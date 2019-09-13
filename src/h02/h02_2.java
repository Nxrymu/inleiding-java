package h02;

import java.applet.Applet;
import java.awt.*;

public class h02_2 extends Applet {

    public void init(){

        setBackground(Color.white);
        setSize(500,500);

    }

    public void paint(Graphics g){

        g.setColor(Color.blue);
        g.drawString("Jay", 200,200);
        g.setColor(Color.red);
        g.drawString("Chung", 200, 215);


    }


}
