package h13;

import java.applet.Applet;
import java.awt.*;

public class h13_PO1 extends Applet {

    public void init(){

        setSize(200,200);

    }

    public void paint(Graphics g){

        tekenBoom(g, 50, 50);
    }
    void tekenBoom(Graphics g, int x, int y){
        g.setColor(new Color(120, 87, 30));
        g.fillRect(x, y, 20, 80);
        g.setColor(Color.green);
        g.fillArc(x - 30, y - 40, 80, 50, 0, 360);
    }

}
