import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Tor lemans = new Tor();
        JFrame frame = new JFrame("Tor");
        frame.add(lemans);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        lemans.dodanie_samochod(100,100,5,0,0,0,255);
        lemans.dodanie_samochod(120,120,5,0,12,14,18);
        for (int i = 0; i < 80; i++) {
            lemans.obliczane_pozycji(lemans.zbior_samochod.elementAt(0));
        }
    }
}
