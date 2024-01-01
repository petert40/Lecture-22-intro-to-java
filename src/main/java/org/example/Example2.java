package org.example;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args){
        // in valid variable
//        boolean valid = 2;
        // the value is not initialized
//        int value;
//        System.out.println(value);
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");
        String firstName = input.nextLine();

        System.out.println("Hello, " + firstName);
        System.out.println("Goodbye " + firstName);

        System.out.printf("Hello %s %s %s\n", firstName, "alpha", "beta");
        input.close();
    }

}
