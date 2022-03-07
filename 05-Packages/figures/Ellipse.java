package figures;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.Random;

public class Ellipse {
    int x, y;
    int w, h;
    float r,g,b;

    public Ellipse (int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    public void print () {
        System.out.format("Retangulo de tamanho (%d,%d) na posicao (%d,%d).\n",
            this.w, this.h, this.x, this.y);
    }

    public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        randColor();
        g2d.setColor(new Color(this.r, this.g, this.b));
        g2d.fill(new Ellipse2D.Double(this.x,this.y, this.w,this.h));
        randColor();
        g2d.setColor(new Color(this.r, this.g, this.b));
        g2d.draw(new Ellipse2D.Double(this.x,this.y, this.w,this.h));
    }

    void randColor(){
        Random rand = new Random();
        this.r=rand.nextFloat();
        this.g=rand.nextFloat();
        this.b=rand.nextFloat();
    }
}
