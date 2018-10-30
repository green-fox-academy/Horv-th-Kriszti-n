package com.company;

public class Sum {

    public static void main(String[] args) {
    int a = 5;
    int b = 8;
    sum(a, b);
        System.out.println(sum(a, b, 54, 76, 32));
    }

    public static int sum(int ... numbers) {
        int osszeg = 0;
        for (int i = 0; i < numbers.length; i++){
            osszeg = osszeg + numbers[i];
        }
        return osszeg;


    }
}
