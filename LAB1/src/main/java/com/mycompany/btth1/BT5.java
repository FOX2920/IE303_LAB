package com.mycompany.btth1;

import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("s1: ");
        String s1 = scanner.nextLine();

        System.out.print("s2: ");
        String s2 = scanner.nextLine();

        // 1. Sum of the lengths of 2 strings
        int totalLength = s1.length() + s2.length();
        System.out.println("Sum of 2 strings: " + totalLength);

        // 2. Get the first 3 characters of s1
        String first3CharsS1 = s1.substring(0, Math.min(s1.length(), 3));
        System.out.println("First 3 characters of s1: " + first3CharsS1);

        // 3. Get the last 3 characters of s2
        String last3CharsS2 = s2.substring(Math.max(0, s2.length() - 3));
        System.out.println("Last 3 characters of s2: " + last3CharsS2);

        // 4. Get the 6th character of s1
        if (s1.length() >= 6) {
            char char6OfS1 = s1.charAt(5);
            System.out.println("6th character of s1: " + char6OfS1);
        } else {
            System.out.println("s1 does not have enough characters to retrieve the 6th character.");
        }

        // 5. Check if 2 strings are equal
        if (s1.equals(s2)) {
            System.out.println("s1 and s2 are equal.");
        } else {
            System.out.println("s1 and s2 are not equal.");
        }

        // 6. Check if s2 appears in s1
        int index = s1.indexOf(s2);
        if (index != -1) {
            System.out.println("s2 appears in s1 at position: " + index);
        } else {
            System.out.println("s2 does not appear in s1.");
        }

    }
}
