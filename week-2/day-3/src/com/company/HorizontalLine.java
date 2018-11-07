package com.company;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class HorizontalLine {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a 50 long horizontal line from that point.
        // Draw 3 lines with that function. Use loop for that.

        for (int i = 0; i < 3; i++) {
            getLine(graphics,1 + (int)(Math.random() * 321),1 + (int)(Math.random() * 321));
        }
    }

    public static void getLine (Graphics graphics, int xCoordinate, int yCoordinate) {
        graphics.setColor(Color.RED);
        if (xCoordinate >= 270) {
            graphics.drawLine(xCoordinate, yCoordinate, xCoordinate - 50, yCoordinate);
        } else {
            graphics.drawLine(xCoordinate, yCoordinate, xCoordinate + 50, yCoordinate);
        }
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
