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

    public double losuj_przyrost_kata(){

        double delta1 = rand.nextDouble();
        return delta1;
    }

    public void ustaw_kat(double kat) {
        if(kat > 2*Math.PI){
            this.kat = 0;
        }
        else{
            this.kat = kat;
        }
    }
}
