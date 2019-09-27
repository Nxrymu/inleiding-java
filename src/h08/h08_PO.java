package h08;

import com.sun.deploy.security.BadCertificateDialog;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class h08_PO extends Applet {

    Button keer;
    Button min;
    Button plus;
    Button delen;
    TextField tekstvak1;
    TextField tekstvak2;
    int antwoord;

    public void init(){
        setSize(500,500);

        antwoord = 0;

        tekstvak1 = new TextField("",20);
        add(tekstvak1);

        tekstvak2 = new TextField("",20);
        add(tekstvak2);

        keer = new Button();
        keer.setLabel( "*" );
        keer.addActionListener(new keerKnopListener());
        add(keer);


        min = new Button();
        min.setLabel( "-" );
        min.addActionListener(new minKnopListener());
        add(min);

        plus = new Button();
        plus.setLabel( "+" );
        plus.addActionListener(new plusKnopListener());
        add(plus);

        delen = new Button();
        delen.setLabel( ":" );
        delen.addActionListener(new delenKnopListener());
        add(delen);

    }

    public class keerKnopListener implements ActionListener {

        public void actionPerformed(ActionEvent e){
            String s = tekstvak1.getText();
            int input = Integer.parseInt(s);
            int input2 = Integer.parseInt(tekstvak2.getText());
            int antwoord = input * input2;
            tekstvak1.setText("" + antwoord);
            tekstvak2.setText("");
        }
    }

    public class minKnopListener implements ActionListener{

        public void actionPerformed(ActionEvent e){
            String s = tekstvak1.getText();
            int input = Integer.parseInt(s);
            int input2 = Integer.parseInt(tekstvak1.getText());
            int antwoord = input - input2;
            tekstvak1.setText("" + antwoord);
            tekstvak2.setText("");
        }
    }

    public class plusKnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String s = tekstvak1.getText();
            int input = Integer.parseInt(s);
            int input2 = Integer.parseInt(tekstvak1.getText());
            int antwoord = input + input2;
            tekstvak1.setText("" + antwoord);
            tekstvak2.setText("");
        }
    }

    public class delenKnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String s = tekstvak1.getText();
            int input = Integer.parseInt(s);
            int input2 = Integer.parseInt(tekstvak1.getText());
            int antwoord = input / input2;
            tekstvak1.setText("" + antwoord);
            tekstvak2.setText("");
        }
    }


}
