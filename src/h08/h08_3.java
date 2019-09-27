package h08;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class h08_3 extends Applet {

    Button okknop;
    TextField tekstvak;
    Double som;
    Double cijfer;
    Double uitkomst;

    public void init(){
        cijfer = 0.0;

        okknop = new Button();
        okknop.setLabel( "Ok" );
        okknop.addActionListener(new okKnopListener());
        add(okknop);

        setSize(500,500);
        tekstvak = new TextField(cijfer + "",20);
        double cijfer = Double.parseDouble(tekstvak.getText());
        tekstvak.setEditable(true);
        add(tekstvak);


    }

    public void paint(Graphics g){
        g.drawString("Type het bedrag in het tekstvakje en klik op ok",50,50);

    }

    public class okKnopListener implements ActionListener{
        public void actionPerformed( ActionEvent e ) {
            double input = Double.parseDouble(tekstvak.getText());

            som = input/100;
            uitkomst = som*21;
            uitkomst = uitkomst+input;
            System.out.println(uitkomst);
            tekstvak.setText(uitkomst + "");
            repaint();
        }
    }
}
