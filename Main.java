import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.util.Scanner;

import javax.swing.JComponent;
import javax.swing.JFrame;

//Test to build a rectangle

class MyCanvas extends JComponent {
  public void paint(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;

    // draw a rectangle

    double leftX = 100;
    double topY = 100;
    double width = 200;
    double height = 150;

    //create rectangles
    Rectangle2D rect = new Rectangle2D.Double(leftX, topY, width, height);
    g2.draw(rect);
    Rectangle2D reect = new Rectangle2D.Double(leftX+10d, topY+10d, width+5d, height+5d);
    g2.draw(reect);

  }
}

public class Main {
  public static void main(String[] a) {
    //Display
    JFrame window = new JFrame();
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setBounds(30, 30, 450, 450);
    //canvas Creation
    window.getContentPane().add(new MyCanvas());
    window.setVisible(true);
    
  }
}
