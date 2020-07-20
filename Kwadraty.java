import java.awt.*;
import javax.swing.*;

public class Kwadraty extends Canvas {

    public void rysuj_kwadraty (int n, int lg, int x, int y){

    Graphics gc=this.getGraphics();
    
    if (n>0){
                    gc.drawLine(x, y, x+lg, y); 
                    gc.drawLine(x+lg, y, x+lg, y+lg); 
                    gc.drawLine(x+lg, y+lg, x, y+lg); 
                    gc.drawLine(x, y+lg, x, y+lg/2); 
                    gc.drawLine(x, y+lg/2, x+lg/2, y+lg);   
                    gc.drawLine(x+lg/2, y+lg, x+lg, y+lg/2);  
                    gc.drawLine(x+lg, y+lg/2, x+lg/2, y);   
                    gc.drawLine(x+lg/2, y, x+lg/4, y+lg/4);
             rysuj_kwadraty(n-1, lg/2, x+lg/4, y+lg/4);  
                    gc.drawLine(x+lg/4, y+lg/4, x, y+lg/2); 
                    gc.drawLine(x, y+lg/2, x, y); 
          }
    }

    public void paint(Graphics graphics)
    {
    int szer=this.getWidth();
    rysuj_kwadraty(6, 380, 15, 15);
    }


public static void main(String[] args) {
Kwadraty kw= new Kwadraty();
JFrame f = new JFrame("rek kwadraty");

f.setLocation(100,100);
f.setSize(450,450);
f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
f.getContentPane().add(kw);
f.setVisible(true);
}
}