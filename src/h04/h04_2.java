package h04;

import java.applet.Applet;
import java.awt.*;

public class h04_2 extends Applet {

    public void init(){

        setBackground(Color.white);
        setSize(500,500);

    }

    public void paint(Graphics g){

        g.setColor(Color.BLACK);
        g.drawLine(70,120,120,120);
        g.drawLine(70,120,95,95);
        g.drawLine(95,95,120,120);

        //Het huis
        g.drawRect(70,120,50,50);

        //Het raam
        g.drawRect(102,130,10,10);

        //De deur
        g.drawRect(78,150,10,20);


    }


}
