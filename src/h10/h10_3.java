package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class h10_3 extends Applet {

    TextField tekstvak;
    String s, tekst;
    int maand;

    public void init(){

        setSize(500,500);

        tekstvak = new TextField(20);
        tekstvak.addActionListener(new tekstvakActionListener());
        add(tekstvak);

    }

    public void paint(Graphics g){

        g.drawString(tekst,35,65);

    }

    public class tekstvakActionListener implements ActionListener{

        public void actionPerformed(ActionEvent e){

            s = tekstvak.getText();
            String userInputString = tekstvak.getText();
            maand = Integer.parseInt(userInputString);
            switch (maand){

                case 1:
                    tekst = "januari heeft 31 dagen";
                    break;
                case 2:
                    tekst = "februari heeft 28 dagen";
                    break;
                case 3:
                    tekst = "maart heeft 31 dagen";
                    break;
                case 4:
                    tekst = "april heeft 30 dagen";
                    break;
                case 5:
                    tekst = "mei heeft 31 dagen";
                    break;
                case 6:
                    tekst = "juni heeft 30 dagen";
                    break;
                case 7:
                    tekst = "juli heeft 31 dagen";
                    break;
                case 8:
                    tekst = "augustus heeft 31 dagen";
                    break;
                case 9:
                    tekst = "september heeft 30 dagen";
                    break;
                case 10:
                    tekst = "oktober heeft 31 dagen";
                    break;
                case 11:
                    tekst = "november heeft 30 dagen";
                    break;
                case 12:
                    tekst = "december heeft 31 dagen";
                    break;

            }
            repaint();

        }
    }
}
