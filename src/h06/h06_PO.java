package h06;

import sun.text.normalizer.RuleCharacterIterator;

import java.applet.Applet;
import java.awt.*;

public class h06_PO extends Applet{
double Cijfer1;
double Cijfer2;
double Cijfer3;
double Uitkomst;
int Antwoord;

public void init(){

    Cijfer1 = 5.9;
    Cijfer2 = 6.2;
    Cijfer3 = 6.9;
    Uitkomst = Cijfer1 + Cijfer2 + Cijfer3;
    Uitkomst = Uitkomst/3;
    Uitkomst *= 10.0;
    int Antwoord = (int) Uitkomst;
    Uitkomst = Antwoord;
    Uitkomst = Uitkomst/10;




    }

    public void paint(Graphics g){

    g.drawString("Het gemiddelde is " + Uitkomst + " .",35,35);

}



}

