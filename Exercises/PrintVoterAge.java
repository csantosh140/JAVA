package Exercises;

import java.util.*;

public class PrintVoterAge {
    public static void printVoterAge(int age) {
        if (age <= 0) {
            System.out.println("Oops! Not a valid age, enter correct age");
        } else if (age >= 18) {
            System.out.println("Eligible To Vote");
        } else {
            System.out.println("Not Eligible To Vote");
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Your Age : ");
            int age = sc.nextInt();
            printVoterAge(age);
        }
    }
}
