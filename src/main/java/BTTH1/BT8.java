package BTTH1;

import java.util.Random;
import java.util.Scanner;

public class BT8 {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(100); // Tạo số bí mật ngẫu nhiên từ 0 đến 99
        int low = 0, high = 99; // Phạm vi ban đầu
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.print("(" + low + ", " + high + ")? \n");
            int guess = scanner.nextInt();

            if (guess < low || guess > high) {
                System.out.println("Out of range. Try again?");
                continue;
            }

            if (guess == secretNumber) {
                System.out.println("Bingo.");
                break;
            } else if (guess < secretNumber) {
                low = guess + 1;
                System.out.println("Too small?");
            } else {
                high = guess - 1;
                System.out.println("Too large?");
            }
        }

        scanner.close();
    }
}