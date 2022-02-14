package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int grade;

        System.out.print("Input grade: ");
        grade = input.nextInt();

        if (grade < 60) {
            System.out.println("You Failed!");
        }
        if (grade >= 60 && grade < 70) {
            System.out.println("You got a D!");
        } else if (grade >= 70 && grade < 80) {
            System.out.println("You got a C!");
        } else if (grade >= 80 && grade < 90) {
            System.out.println("You got a B!");
        } else if (grade > 90) {
            System.out.println("You got an A!");
        }
    }
}