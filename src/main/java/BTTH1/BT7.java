package BTTH1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BT7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();
        int[] A = new int[n];
        
        // Nhập từng phần tử của mảng A
        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = scanner.nextInt();
        }
        // Xuất mảng A ra màn hình
        System.out.println("Array A: " + Arrays.toString(A));

        // 1. Tạo mảng B với các giá trị ngẫu nhiên
        int m = 7;
        int[] B = new int[m];
        Random rand = new Random();
        for (int i = 0; i < m; i++) {
            B[i] = rand.nextInt(100); // Ngẫu nhiên từ 0 đến 99
        }

        // 2. Xuất mảng B ra màn hình
        System.out.println("Array B: " + Arrays.toString(B));

        // 3. Tạo mảng C từ mảng A
        int[] C = Arrays.copyOf(A, n);
        System.out.println("Array C 1st: " + Arrays.toString(C));
        // 4. Thay thế 3 phần tử đầu của C bằng 3 phần tử cuối của B
        System.arraycopy(B, m - 3, C, 0, 3);
        System.out.println("Array C before sort: " + Arrays.toString(C));
        // 5. Sắp xếp mảng C tăng dần và xuất ra màn hình
        Arrays.sort(C);
        System.out.println("Array C after sort: " + Arrays.toString(C));
    }
}