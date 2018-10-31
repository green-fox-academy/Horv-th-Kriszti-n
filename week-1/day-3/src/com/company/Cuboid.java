package com.company;

public class Cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000

        double l, w, h;
        double area, volume;
        l = 4.5;
        w = 5.8;
        h = 6.2;
        area = 2 * ((l * w) + (w * h) + (h * l));
        volume = l * w * h;
        System.out.println("Surface Area: " + area);
        System.out.println("Volume: " + volume);

    }

}
