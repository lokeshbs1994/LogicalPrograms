package com.company;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        byte flag=0;
        if (num == 0 || num == 1) {
            System.out.println(num + " is not prime number");
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    flag = 1;
                    break;
                }
            }
        }
        if (flag!=1) {
            System.out.println(num+" is a prime number");
        } else {
            System.out.println(num+" is a not prime number");
        }
    }
}
