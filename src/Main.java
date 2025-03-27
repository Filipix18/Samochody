import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Tor lemans = new Tor();
        JFrame frame = new JFrame("Tor");
        frame.add(lemans);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        lemans.dodanie_samochod(75,150,5,Math.PI*1.5,0,0,255);
        lemans.dodanie_samochod(75,150,5,0,102,14,18);
        for (int i = 0; i < 300; i++) {
            lemans.zbior_samochod.elementAt(0).kat += lemans.zbior_samochod.elementAt(0).losuj_przyrost_kata();  //Dodajemy losowy kat
            lemans.zbior_samochod.elementAt(0).ustaw_kat();  //Resetowanie kata po przekroczeniu linii startu
            lemans.zbior_samochod.elementAt(0).obliczane_pozycji();  //Obliczenie pozycji na podstawie kata
            lemans.repaint();  // Odświeżenie okna
            try {
                Thread.sleep(100); // Opóźnienie 1000 ms (1 sekunda)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
