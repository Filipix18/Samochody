import javax.lang.model.util.SimpleAnnotationValueVisitor6;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;

public class Tor extends JPanel {


    Vector<Samochody> zbior_samochod = new Vector();

    public void dodanie_samochod(int x, int y, int radius, double kat,int R, int G, int B ){
        zbior_samochod.addElement(new Samochody(x, y, radius, kat, R, G, B));


    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);  // Musi być, by poprawnie działało
        tor(g);  // Wywołanie własnej metody rysującej
        rys_samochody(g);
    }

    // Dodatkowa metoda do rysowania
    private void tor(Graphics g) {
        setBackground(Color.GREEN);
        g.setColor(Color.BLACK);
        g.fillOval(50, 50, 200, 200);
        g.setColor(Color.GREEN);
        g.fillOval(100, 100, 100, 100);
    }

    public void rys_samochody(Graphics g){
        for (int i = 0; i < zbior_samochod.size(); i++) {
            g.setColor(zbior_samochod.elementAt(i).Daj_kolor());
            g.fillOval(zbior_samochod.elementAt(i).x, zbior_samochod.elementAt(i).y,zbior_samochod.elementAt(i).radius,zbior_samochod.elementAt(i).radius);

            new Thread(()->{

            }).start();
        }
    }

    public void obliczane_pozycji(Samochody auto){
        int pozycja_poczX = auto.x;
        int pozycja_poczY = auto.y;
        auto.x += auto.radius*Math.sin(auto.losuj_przyrost_kata());
        auto.y += auto.radius*Math.cos(auto.losuj_przyrost_kata());
        System.out.print("x :"+auto.x);
        System.out.println("---y :"+auto.y);
    }
}
