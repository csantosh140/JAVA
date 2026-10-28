package Exercises;

import java.util.*;

public class FindGreaterNumber {
    public static void printGreater(int a, int b) {
        if(a > b) {
            System.out.print("Number a is greater");
        }
        else if(a < b) {
            System.out.print("Number B is Greater");
        }
        else {
            System.out.print("Both Two Numbers Are Equal");
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a Value : ");
            int a = sc.nextInt();
            System.out.print("Enter b Value : ");
            int b = sc.nextInt();
            printGreater(a, b);
        }
    }
}

