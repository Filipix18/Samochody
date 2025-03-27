import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Samochody {
    Random rand = new Random();
    int R;
    int G;
    int B;
    int x;
    int y;
    int radius;
    double kat;

    public Samochody (int x, int y, int radius, double kat,int R, int G, int B){
        this.R = R;
        this.G = G;
        this.B = B;
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.kat = kat;
    }

    public Color Daj_kolor(){
        return new Color(R, G, B);
    }

    public double losuj_przyrost_kata(){  //Losuje o jaki kat ma pojechac samochod
        double delta1 = rand.nextDouble()*0.1;
        return delta1;
    }

    public void ustaw_kat() {  //Zapobiega nagromadzeniu kata
        if(this.kat > 2*Math.PI){
            this.kat -= 2*Math.PI;
        }
        else{
            this.kat = this.kat;
        }
    }

    public void obliczane_pozycji(){  //Oblicza pozycje x,y na podstawie kata
        this.x = (int) (75*Math.sin(this.kat)+150);
        this.y = (int) (75*Math.cos(this.kat)+150);
        System.out.print("x :"+this.x);
        System.out.println("---y :"+this.y);
    }
}
