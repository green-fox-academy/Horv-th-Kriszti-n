package com.company;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class EnvelopeStar {
    public static void mainDraw(Graphics graphics) {
        int changer = 12;
        for (int i = 0; i < 12; i++){

            graphics.setColor(Color.GREEN);
            graphics.drawLine(WIDTH/2, 0, WIDTH/2, HEIGHT);
            graphics.drawLine(WIDTH/2, changer, WIDTH/2 + changer, HEIGHT/2);
            graphics.drawLine(WIDTH/2, changer, WIDTH/2 - changer, HEIGHT/2);
            graphics.drawLine(WIDTH/2,HEIGHT - changer , WIDTH/2 - changer, HEIGHT/2);
            graphics.drawLine(WIDTH/2,HEIGHT - changer , WIDTH/2 + changer, HEIGHT/2);
            changer += 12;
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
