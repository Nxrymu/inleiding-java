package h11;

import java.applet.Applet;
import java.awt.*;

public class h11_5 extends Applet {
    public void init(){;

        setSize(400,400);

    }
    public void paint(Graphics g){

        int y = 0;
        int x = 20;

        while(y<200) {
            y +=40;
            x +=40;
            g.drawRect(x,y,40,40);

        }
    }
}