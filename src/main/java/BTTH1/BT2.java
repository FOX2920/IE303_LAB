package BTTH1;

import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x: ");
        double x = scanner.nextDouble();
        System.out.print("n: ");
        int n = scanner.nextInt();
        
        double sum = 0;
        double d = 0;
        for (int i = 1; i <= n; i++) {
            d += i;
            double tem = Math.pow(x, i) / d;
            sum += tem;
        }
        
        System.out.println("S(" + n + ") = " + sum);
    }
}