package h13;

import java.applet.Applet;
import java.awt.*;

public class h13_1 extends Applet {

    public void init(){

        setSize(500,500);

    }
    public void paint(Graphics g){

        drawTriangle(g, 100, 200, 200, 400, 400, 100);
    }
    void drawTriangle( Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x2, y2, x3, y3);
        g.drawLine(x3, y3, x1, y1);
    }

}
