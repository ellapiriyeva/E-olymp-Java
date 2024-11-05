package org.example;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int firstDigit = num / 1000;
        int lastDigit = num % 10;
        int sumOfDigits = firstDigit + lastDigit;

        System.out.println(sumOfDigits);
    }
}