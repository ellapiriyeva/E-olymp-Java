package org.example;

import java.util.Scanner;
public class FirstOrLast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int firstDigit = number / 100;
        int lastDigit = number % 10;

        if(firstDigit > lastDigit){
            System.out.println(firstDigit);
        } else if(lastDigit > firstDigit){
            System.out.println(lastDigit);
        }else{
            System.out.println("=");
        }
    }
}