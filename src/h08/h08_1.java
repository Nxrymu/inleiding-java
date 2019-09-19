package h08;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class h08_1 extends Applet {

    Button Okknop;
    Button Resetknop;
    TextField tekstvak;
    Label label;

    public void init(){
        setSize(500, 200);
        label = new Label("Search");
        add(label);
        Okknop = new Button();
        Okknop.setLabel( "Ok" );
        Okknop.addActionListener(new OkKnopListener());
        add(Okknop);
        tekstvak = new TextField("Type here...",20);
        add(tekstvak);

        Resetknop = new Button();
        Resetknop.setLabel( "Reset" );
        Resetknop.addActionListener(new ResetKnopListener());
        add(Resetknop);


    }

    class OkKnopListener implements ActionListener{
        public void actionPerformed( ActionEvent e ) {
            tekstvak.setText("Sorry, try again");
            repaint();
        }
    }

    class ResetKnopListener implements ActionListener{
        public void actionPerformed( ActionEvent e ){
            tekstvak.setText(" ");
        }
    }

}