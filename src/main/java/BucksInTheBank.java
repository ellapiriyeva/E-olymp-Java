package org.example;
import java.util.Scanner;

public class BucksInTheBank {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        long S = scanner.nextLong();

        long total = 0;
        long previousGift = 1;
        int age = 1;

        while (total < S){
            total += previousGift;
            age++;
            previousGift = 2 * previousGift + age;
        }
        System.out.println(age - 1);
    }
}