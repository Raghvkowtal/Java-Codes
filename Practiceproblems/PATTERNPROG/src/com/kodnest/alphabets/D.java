package com.kodnest.alphabets;
public class D {
    public static void main(String[] args) {
        int n = 10; // Size of the pattern, you can adjust this as needed

        for (int i = 0; i < n; i++) {
            System.out.print("*");
            for (int j = 0; j < n; j++) {
                if ((i == 0 || i == n - 1) && j < n - 1) {
                    System.out.print("*");
                } else if (j == n - 1 && i != 0 && i != n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
