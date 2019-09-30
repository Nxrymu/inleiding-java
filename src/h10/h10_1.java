package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class h10_1 extends Applet {

    TextField tekstvak;
    boolean firstNumber;
    int maxInput;
    int minInput;
    int userInput;
    String sorry;


    public void init() {
        setSize(500, 500);

        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new tekstKnopListener());
        add(tekstvak);

        maxInput = 0;
        minInput = 0;
        firstNumber = true;
        sorry = "";
    }

    public void paint(Graphics g) {
        g.drawString("Max Input:" + maxInput, 45, 95);
        g.drawString("Min Input:" + minInput, 45, 125);
    }

    public class tekstKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String userInputString = tekstvak.getText();
            userInput = Integer.parseInt(userInputString);
            if (firstNumber) {
                firstNumber = false;
                maxInput = userInput;
                minInput = userInput;
                repaint();
            } else {
                if (userInput > maxInput) ;
                {
                    maxInput = userInput;
                    repaint();
                }
            }
            }
        }
    }

