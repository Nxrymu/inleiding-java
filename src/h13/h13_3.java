package h13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class h13_3 extends Applet {

    Button rodeMuurknop, betonknop;

    public void init(){
        rodeMuurknop = new Button("Rode Muur");
        rodeMuurknop.addActionListener(new RodeMuurKnopListener());
        betonknop = new Button("Betone Muur");
        betonknop.addActionListener(new BetonKnopListener());
        add(rodeMuurknop);
        add(betonknop);

    }
    class RodeMuurKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            tekenRodeMuur(getGraphics(), 50, 50, 40, 20);
        }
    }
    class BetonKnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            tekenBetonMuur(getGraphics(), 50, 50, 60, 40);
        }
    }
    public void paint(Graphics g){

    }
    void tekenRodeMuur(Graphics g, int x, int y, int width, int height){
        for (int i = 0; i < 12; i++) {
            x = 20;
            for (int j = 0; j < 12; j++) {
                g.setColor(Color.RED);
                g.fillRect(x, y, width, height);
                g.setColor(Color.BLACK);
                g.drawRect(x, y, width, height);
                x += width;
            }
            y += height;
        }
    }
    void tekenBetonMuur(Graphics g, int x, int y, int width2, int height2){
        for (int i = 0; i < 6; i++) {
            x = 20;

            for (int j = 0; j < 8; j++) {
                g.setColor(Color.DARK_GRAY);
                g.fillRect(x, y, width2, height2);
                g.setColor(Color.BLACK);
                g.drawRect(x, y, width2, height2);
                x += width2;
            }
            y += height2;
        }
    }

}
