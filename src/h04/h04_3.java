package h04;

import java.applet.Applet;
import java.awt.*;

public class h04_3 extends Applet {

    public void init(){

        setBackground(Color.white);
        setSize(500,500);

    }

    public void paint(Graphics g){

        //Stok van de vlag.
        g.drawLine(219, 170, 219, 90);

        //De vlag zelf.
        g.setColor(Color.BLUE);
        g.fillRect(140, 70, 80, 20);
        g.setColor(Color.WHITE);
        g.fillRect(140, 50, 80, 20);
        g.setColor(Color.RED);
        g.fillRect(140, 30, 80, 20);


    }


}
