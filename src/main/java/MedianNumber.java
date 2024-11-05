package org.example;
import java.util.Scanner;

public class MedianNumber {
    public static int Median(
            int a,
            int b,
            int c
    ) {
        if ((a > b && a < c) || (a < b && a > c)) {
            return a;
        }
        else if ((b > a && b < c) || (b < a && b > c)) {
            return b;
        }
        else {
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int median = Median(a, b, c);
        System.out.println(median);
    }
}
