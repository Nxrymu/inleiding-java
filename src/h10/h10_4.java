package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class h10_4 extends Applet {

    TextField tekstvakmaand;
    TextField tekstvakjaar;
    String s, tekst;
    int maand;
    int jaar;
    String j, tekst2;


    public void init(){

        setSize(500,500);

        tekstvakmaand = new TextField(20);
        tekstvakmaand.addActionListener(new tekstvakActionListener());
        add(tekstvakmaand);

        tekstvakjaar = new TextField(20);
        tekstvakjaar.addActionListener(new tekstvakActionListener());
        add(tekstvakjaar);

    }

    public void paint(Graphics g){

        g.drawString(tekst,35,65);
        g.drawString(tekst2,35,75);

    }

    public class tekstvakActionListener implements ActionListener{

        public void actionPerformed(ActionEvent e){

            s = tekstvakmaand.getText();
            String userInputString = tekstvakmaand.getText();
            maand = Integer.parseInt(userInputString);
            j = tekstvakjaar.getText();
            String userInputString2 = tekstvakjaar.getText();
            jaar = Integer.parseInt(userInputString2);

            if ((jaar % 4 == 0 && !(jaar % 100 == 0))) {
                tekst2 = "" + jaar + " is een schrikkeljaar";
            }
            else {
                tekst2 = "" + jaar + " is geen schrikkel jaar";
            }
            repaint();
            switch (maand){

                case 1:
                    tekst = "januari heeft 31 dagen";
                    break;
                case 2:
                    if ((jaar % 4 == 0 && !(jaar % 100 == 0))) {
                    tekst = "Februari heeft 29 dagen.";
                }
                else{
                    tekst = "Februari heeft 28 dagen.";
                }
                repaint();
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

                default:
                    throw new IllegalStateException("Unexpected value: " + maand);
            }
            repaint();

        }
    }
}
