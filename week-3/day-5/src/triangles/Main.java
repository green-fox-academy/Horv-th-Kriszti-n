package triangles;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {
    public static void mainDraw(Graphics graphics) {
      int counter = 6;
      drawTriangles(graphics, 0, 0 ,WIDTH, counter);
    }
public static void drawTriangles(Graphics graphics, double x, double y, int canvasSize, int counter) {

      //graphics.setColor(Color.BLACK);
  if (counter > 0) {
    //vízszintes vonal
    graphics.drawLine((int) x, (int) y, (int) x + canvasSize, (int) y);
    //jobbról lefelé
    graphics.drawLine(canvasSize, (int) y, canvasSize / 2, canvasSize);
    //balról lefelé
    graphics.drawLine((int) x, (int) y, (int) x + canvasSize / 2, canvasSize);
    //belső háromszög alsó része
    graphics.drawLine((int) x + canvasSize / 4, canvasSize / 2, (int) x + canvasSize * 3 / 4, canvasSize / 2);
    //belső háromszög balról
    graphics.drawLine((int) x + canvasSize / 4, canvasSize / 2, (int) x + canvasSize / 2, (int) y);
    //belső háromszög jobbról
    graphics.drawLine((int) x + canvasSize * 3 / 4, canvasSize / 2, (int) x + canvasSize / 2, (int) y);

    drawTriangles(graphics, x/2, y/2, canvasSize/2, counter -1);
    drawTriangles(graphics, x + canvasSize/2, y, canvasSize/2, counter -1);
    //drawTriangles(graphics, x + canvasSize/4, y + canvasSize, canvasSize/2, counter -1);

    return;
  }



}




    // Don't touch the code below
    static int WIDTH = 729;
    static int HEIGHT = 729;

    public static void main(String[] args) {
      JFrame jFrame = new JFrame("Drawing");
      jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
      ImagePanel panel = new ImagePanel();
      panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
      jFrame.add(panel);
      jFrame.setLocationRelativeTo(null);
      jFrame.setVisible(true);
      jFrame.pack();
    }

    static class ImagePanel extends JPanel {
      @Override
      protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        mainDraw(graphics);
      }
    }
}
