package figures;

import java.awt.*;
import java.util.Random;

public class Sqr {
    int x, y;
    int s;
    float r,g,b;

    public Sqr (int x, int y, int s) {
        this.x = x;
        this.y = y;
        this.s = s;
    }

    public void print () {
        System.out.format("Quadrado de tamanho (%d) na posicao (%d,%d).\n",
            this.s, this.x, this.y);
    }

    public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        randColor();
        g2d.setColor(new Color(this.r,this.g,this.b));
        g2d.fillRect(this.x, this.y, this.s,this.s);
        randColor();
        g2d.setColor(new Color(this.r,this.g,this.b));
        g2d.drawRect(this.x,this.y, this.s,this.s);
    }

    void randColor(){
        Random rand = new Random();
        this.r=rand.nextFloat();
        this.g=rand.nextFloat();
        this.b=rand.nextFloat();
    }
}
