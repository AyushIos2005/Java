package Asg_3;

import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check: ");
        int num = sc.nextInt();

        // Check if the final single-digit sum is 1
        if (checkMagic(num) == 1) {
            System.out.println(num + " is a Magic Number.");
        } else {
            System.out.println(num + " is NOT a Magic Number.");
        }

        sc.close();
    }

    // Recursive function to continuously reduce the number to a single digit
    public static int checkMagic(int n) {
        // Base Case: If the number is already a single digit, return it
        if (n < 10) {
            return n;
        }

        // Recursive Case: Find the sum of digits, then pass that sum back into checkMagic
        return checkMagic(sumOfDigits(n));
    }

    // Recursive helper function to find the sum of digits of a number
    public static int sumOfDigits(int n) {
        // Base Case: If no digits are left
        if (n == 0) {
            return 0;
        }
        // Recursive Case: Extract the last digit + sum of the remaining digits
        return (n % 10) + sumOfDigits(n / 10);
    }
}
