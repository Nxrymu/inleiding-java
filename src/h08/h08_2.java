package h08;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class h08_2 extends Applet {

    Button jongens;
    Button meisjes;
    Button mannen;
    Button vrouwen;

    int aantaljongens;
    int aantalmeisjes;
    int aantalmannen;
    int aantalvrouwen;
    int totaalaantal;


    public void init(){
        jongens = new Button();
        jongens.setLabel( "Jongens" );
        jongens.addActionListener(new jongensKnopListener());
        add(jongens);

        meisjes = new Button();
        meisjes.setLabel( "Meisjes" );
        meisjes.addActionListener(new meisjesKnopListener());
        add(meisjes);

        mannen = new Button();
        mannen.setLabel( "Mannen" );
        mannen.addActionListener(new mannenKnopListener());
        add(mannen);

        vrouwen = new Button();
        vrouwen.setLabel( "Vrouwen" );
        vrouwen.addActionListener(new vrouwenKnopListener());
        add(vrouwen);

        aantaljongens = 0;
        aantalmeisjes = 0;
        aantalmannen = 0;
        aantalvrouwen = 0;
        totaalaantal = 0;


    }
    public void paint(Graphics g){
        //de jongens etc.
        g.drawString("Aantal jongens",30,90);
        g.drawString("Aantal meisjes",30,105);
        g.drawString("Aantal mannen",30,120);
        g.drawString("Aantal vrouwen",30,135);
        g.drawString("Totaal aantal",30,150);
        //de ondersceidingslijnen
        g.drawLine(30,93,155,93);
        g.drawLine(30,108,155,108);
        g.drawLine(30,123,155,123);
        g.drawLine(30,138,155,138);
        //verticale lijn
        g.drawLine(120,80,120,151);
        //aantal mensen
        g.drawString(aantaljongens + "",123,90);
        g.drawString(aantalmeisjes + "",123,105);
        g.drawString(aantalmannen + "",123,120);
        g.drawString(aantalvrouwen + "",123,135);
        g.drawString(totaalaantal + "",123,150);
    }


    class jongensKnopListener implements ActionListener{
        public void actionPerformed( ActionEvent e ) {
            aantaljongens ++;
            totaalaantal ++;

            repaint();
        }
    }

    class meisjesKnopListener implements ActionListener{
        public void actionPerformed( ActionEvent e ) {
            aantalmeisjes ++;
            totaalaantal ++;
            repaint();
        }
    }

    class mannenKnopListener implements ActionListener{
        public void actionPerformed( ActionEvent e ) {
            aantalmannen ++;
            totaalaantal ++;
            repaint();
        }
    }

    class vrouwenKnopListener implements ActionListener{
        public void actionPerformed( ActionEvent e ) {
            aantalvrouwen ++;
            totaalaantal ++;
            repaint();
        }
    }



}