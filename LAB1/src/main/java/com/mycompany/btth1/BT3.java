package com.mycompany.btth1;

import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        System.out.print("c: ");
        double c = scanner.nextDouble();
        
        double p = a + b + c;
        double t = p / 2;
        double s = Math.sqrt(t * (t - a) * (t - b) * (t - c));
        
        System.out.println("Perimeter: " + p);
        System.out.println("Area: " + s);
    }
}