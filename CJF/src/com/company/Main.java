package com.company;

public class Main {

    public static void main(String[] args) {
        float X = 5.0F;
        System.out.println("X: " + X);
        float Y = 4.0F;
        System.out.println("Y: " + Y);
        double suma = (double)(X + Y);
        System.out.println("Suma: " + suma);
        double rest = (double)(X - Y);
        System.out.println("Resta: " + rest);
        double mult = (double)(X * Y);
        System.out.println("Multiplicación :" + mult);
        float div = X / Y;
        System.out.println("División: " + div);
        double mod = (double)(X % Y);
        System.out.println("Módulo: " + mod);
    }
}
