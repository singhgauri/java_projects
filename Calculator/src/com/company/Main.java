package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float num1 = input.nextFloat();

        System.out.print("Enter second number: ");
        float num2 = input.nextFloat();

        System.out.println("Sum of the two numbers you entered i.e\n " + num1 + " + " + num2 + " = " + (num1 + num2));

    }
}
