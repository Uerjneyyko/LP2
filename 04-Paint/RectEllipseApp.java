import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.Ellipse2D;
import java.util.Random;

class RectEllipseApp {
    public static void main (String[] args) {
        RectEllipseFrame frame = new RectEllipseFrame();
        frame.setVisible(true);
    }
}

class RectEllipseFrame extends JFrame {
    Ellipse e1;
    Ellipse e2;
    Ellipse e3;
    RectEllipseFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Ellipse");
        this.setSize(350, 350);
        this.e1 = new Ellipse(25,100, 100,30);
        this.e2 = new Ellipse(150,100, 100,30);
        this.e3 =new Ellipse(150,200, 30,100);
    }

    public void paint (Graphics g) {
        super.paint(g);
        this.e1.paint(g);
        this.e2.paint(g);
        this.e3.paint(g);
    }
}


class Ellipse {
    int x, y;
    int w, h;
    float r,g,b;
    Ellipse (int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    void print () {
        System.out.format("Elipse de tamanho (%d,%d) na posicao (%d,%d) de cores R=%f G=%f B=%f.\n",
            this.w, this.h, this.x, this.y, this.r, this.g, this.b);
    }

    void paint (Graphics g) {
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
