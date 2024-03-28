/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.btth2;

/**
 *
 * @author Hii
 */
import java.util.Scanner;

public class BT1_2 {

    // Method to find the greatest common divisor (GCD) of two numbers
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Method to simplify the fraction
    public static String simplifyFraction(int numerator, int denominator) {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
        return numerator + "/" + denominator;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first fraction (in the form a/b):");
        String input1 = scanner.next();
        String[] fraction1 = input1.split("/");
        int a1 = Integer.parseInt(fraction1[0]);
        int b1 = Integer.parseInt(fraction1[1]);

        System.out.println("Enter the second fraction (in the form a/b):");
        String input2 = scanner.next();
        String[] fraction2 = input2.split("/");
        int a2 = Integer.parseInt(fraction2[0]);
        int b2 = Integer.parseInt(fraction2[1]);

        // Addition
        int sumNumerator = a1 * b2 + a2 * b1;
        int sumDenominator = b1 * b2;
        System.out.println("Sum of the fractions: " + simplifyFraction(sumNumerator, sumDenominator));

        // Subtraction
        int differenceNumerator = a1 * b2 - a2 * b1;
        int differenceDenominator = b1 * b2;
        System.out.println("Difference of the fractions: " + simplifyFraction(differenceNumerator, differenceDenominator));

        // Multiplication
        int productNumerator = a1 * a2;
        int productDenominator = b1 * b2;
        System.out.println("Product of the fractions: " + simplifyFraction(productNumerator, productDenominator));

        // Division
        int quotientNumerator = a1 * b2;
        int quotientDenominator = b1 * a2;
        System.out.println("Quotient of the fractions: " + simplifyFraction(quotientNumerator, quotientDenominator));
    }
}
