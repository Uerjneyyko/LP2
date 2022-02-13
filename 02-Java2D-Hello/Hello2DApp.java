import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Hello2DApp {
    public static void main (String[] args) {
        Hello2DFrame frame = new Hello2DFrame();
    }
}

class Hello2DFrame extends JFrame {
    public Hello2DFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Java2D - Hello World!");
        this.setSize(350, 350);
        this.setVisible(true);
        getContentPane().setBackground(Color.red);
    }

    public void paint (Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(Color.black);
        int w = getWidth();
        int h = getHeight();
        g2d.drawLine(0,0, w,h);
        g2d.drawLine(0,h, w,0);
        int p=0;
        for(p=0 ; p <= getHeight() ; p += 10){
            g.drawLine(0, p, p, getHeight());
         }

        for(p=getHeight() ; p >=0 ; p -= 10){
            g.drawLine(0, p, getHeight() - p, 0);
     }
     
        for(p=0 ; p <= getHeight() ; p +=10){
            g.drawLine(getWidth(), p, getWidth() - p, getHeight());
     }
     
        for(p=getHeight() ; p >=0 ; p -= 10){
            g.drawLine(getWidth(), p, getWidth() - (getHeight() - p), 0);
     }
    }
    

}