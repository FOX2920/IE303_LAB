package com.mycompany.btth1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BT9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N: ");
        int N = scanner.nextInt();

        // Tạo danh sách các công dân từ 0 đến N-1
        List<Integer> citizens = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            citizens.add(i);
        }

        // Xáo trộn danh sách công dân
        Collections.shuffle(citizens);

        // Tạo mảng contactee để lưu trữ người tiếp xúc của mỗi công dân
        int[] contactee = new int[N];
        for (int i = 0; i < N; i++) {
            contactee[i] = citizens.get(i);
        }

        // In ra bảng chuỗi virus lây lan
        System.out.println("run:");
        System.out.print("       Id |");
        for (int i = 0; i < N; i++) {
            System.out.printf(" %2d", i);
        }
        System.out.println();

        System.out.print("Contactee |");
        for (int i = 0; i < N; i++) {
            System.out.printf(" %2d", contactee[i]);
        }
        System.out.println();


        // Tìm chuỗi virus lây lan và xác định những người cần cô lập
        boolean[] isIsolated = new boolean[N]; // Đánh dấu những người đã được cô lập
        List<Integer> longestChain = new ArrayList<>(); // Chuỗi dài nhất
        for (int i = 0; i < N; i++) {
            if (!isIsolated[i]) {
                List<Integer> infectedChain = new ArrayList<>();
                int current = i;
                while (!isIsolated[current]) {
                    infectedChain.add(current);
                    isIsolated[current] = true;
                    current = contactee[current];
                }
                if (infectedChain.size() > longestChain.size()) {
                    longestChain = infectedChain;
                }
            }
        }
        System.out.println("The following citizens are to be self-isolated:"+longestChain);
    }
}