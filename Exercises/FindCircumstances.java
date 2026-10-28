package Exercises;

import java.util.*;

public class FindCircumstances {
    public static void printCircumference(int radius) {
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference of the circle is : " + circumference);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Radius : ");
            int radius = sc.nextInt();
            printCircumference(radius);
        }
    }
}

