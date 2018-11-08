package com.company;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {
    public static void mainDraw(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/green-fox-academy/teach ing-materials/blob/master/workshop/drawing/purple-steps/r3.png]
        int startPoints = 10;
        int squareSize = 10;
        for (int i = 0; i < 18; i++){
            getSquare(graphics, startPoints, squareSize);
            startPoints += squareSize;
        }
    }
    public static void getSquare(Graphics graphics, int xyPoints, int size){
        graphics.setColor(new Color(176, 78, 240));
        graphics.fillRect(xyPoints, xyPoints, size, size);
        graphics.setColor(Color.BLACK);
        graphics.drawRect(xyPoints - 1, xyPoints - 1, size, size);
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
