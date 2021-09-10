
/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the first number? ");
        int a= input.nextInt();

        System.out.println("What is the second number? ");
        int b= input.nextInt();

        int sum=a+b;
        System.out.printf("%d + %d = %d%n", a,b, sum);

        int difference=a-b;
        System.out.printf("%d - %d = %d%n", a,b,difference);

        int product= a*b;
        System.out.printf("%d * %d = %d%n", a,b,product);

        int division= a/b;
        System.out.printf("%d / %d = %d%n", a,b,division);

    }
}
