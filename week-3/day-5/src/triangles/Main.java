package triangles;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {
    public static void mainDraw(Graphics graphics) {
      int counter = 6;
      drawTriangles(graphics, 0, 0 , 729);
    }
public static void drawTriangles(Graphics graphics, int x, int y, int canvasSize) {

  if (canvasSize > 0) {
    graphics.setColor(new Color((int)(Math.random() * 255), (int)(Math.random() * 255), (int)(Math.random() * 255)));
    //vízszintes vonal
    graphics.drawLine(x, y, x + canvasSize, y);
    //jobbról lefelé
    graphics.drawLine(x + canvasSize, y, x + canvasSize / 2, y + canvasSize);
    //balról lefelé
    graphics.drawLine(x, y,x + canvasSize / 2, y + canvasSize);
    //belső háromszög alsó része
    //graphics.drawLine(x + canvasSize / 4, y + canvasSize / 2, x + canvasSize * 3 / 4, y + canvasSize / 2);
    //belső háromszög balról
    //graphics.drawLine(x + canvasSize / 4, y + canvasSize / 2,x + canvasSize / 2, y);
    //belső háromszög jobbról
    //graphics.drawLine(x + canvasSize * 3 / 4, y + canvasSize / 2, x + canvasSize / 2, y);

    drawTriangles(graphics, x, y, canvasSize/2);
    drawTriangles(graphics, x + canvasSize/2, y, canvasSize/2);
    drawTriangles(graphics, x + canvasSize/4, y + canvasSize / 2, canvasSize/2);
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
