package org.example;
import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int hundreds = num / 100;
        int tens = (num / 10) % 10;
        int units = num % 10;

        int sumOfDigits = hundreds + tens + units;

        double squareRoot = Math.sqrt(sumOfDigits);

        System.out.printf("%.3f%n" , squareRoot);
    }
}