import java.awt.*;
import javax.swing.*;

import javafx.scene.canvas.Canvas;



public class Spirala extends Canvas {

    int alpha=10;

    public void rysujSpirale (int lg, int x, int y) {
            Graphics gc=this.getGraphics();

        if(lg>0){
            gc.drawLine(x,y,x+lg,y);
            gc.drawLine(x,y,x+lg,y);
            gc.drawLine(x,y,x+lg,y);
            gc.drawLine(x,y,x+lg,y);
            rysujSpirale(lg-2*alpha, x+alpha, y+alpha);

        }
        
 
   }

   public void paint(Graphics graphics){
       int szer = this.getWidth();
       rysujSpirale(szer-50, 15, 15);
   }

   public static void main(String[] args) {
       Spirala s=new Spirala();
JFrame f =new JFrame("spirala");

f.setLocation(300, 500);
f.setSize(400,400);
f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
f.getContentPane().add(s);
f.setVisible(true);

   }
}

