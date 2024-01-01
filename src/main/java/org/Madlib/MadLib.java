package org.Madlib;

import java.util.Scanner;

public class MadLib {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give me a name: ");
        String name = input.nextLine();

        System.out.println("Give me an adverb: ");
        String adverb = input.nextLine();

        System.out.println("Give me an adjective: ");
        String adj = input.nextLine();

        System.out.println("Give me a noun: ");
        String noun = input.nextLine();

        System.out.println("Give me another noun: ");
        String noun2 = input.nextLine();

        System.out.println("Give me a number: ");
        String num = input.nextLine();

        System.out.println("Give me your name: ");
        String myName = input.nextLine();

        System.out.println("\noutput as belows:");
        System.out.printf("Dear %s", name);
        System.out.printf("You are %s %s and i want to be your %s!\n", adverb, adj, noun);
        System.out.printf("I want to go to the %s with you in %s days\n", noun2, num);
        System.out.printf("Sincrerly, %s\n", myName);


    }
}
