package org.example;

import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Name:");
        String userName = myObj.nextLine();  // Read user input

        System.out.println("Birth Year:");
        int userAge = myObj.nextInt();

        String age = String.valueOf(2050 - userAge);

        System.out.println(userName +", you will be " + age + " in 2050.");
    }
}
