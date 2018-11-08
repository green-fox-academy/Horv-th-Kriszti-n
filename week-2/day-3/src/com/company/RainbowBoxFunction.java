package com.company;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.
        int newSize = 0;
        for (int i = newSize; i < 320; i++){
            getRainbow(graphics, newSize);
            newSize++;
            /* int newSize = 0;
               for (int i = newSize; i > 0; i--){         <--- Visually this solution is better, but in this case
               getRainbow(graphics, newSize);                  you have to watch for the graphics.fillRect, because
               newSize -= 10;                                  that cover the squares was made before, if you start your
                                                               squares from the edges.*/
        }
    }
    public static void  getRainbow(Graphics graphics, int size){
        int red = (int)(Math.random() * 255);
        int green = (int)(Math.random() * 255);
        int blue = (int)(Math.random() * 255);
        graphics.setColor(new Color(red, green, blue));
        graphics.drawRect((WIDTH - size) / 2, (HEIGHT - size) / 2, size, size);
        /*graphics.fillRect((WIDTH - size) / 2, (HEIGHT - size) / 2, size, size);*/
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

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
