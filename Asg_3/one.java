/*
* . Write a Java program to generate all Prime Numbers within a range, where the range
is user input.
* */

package Asg_3;
import java.util.*;
public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter lower bound (start): ");
        int start = sc.nextInt();

        System.out.print("Enter upper bound (end): ");
        int end = sc.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + " are:");
        for (int num = start; num <= end; num++) {

            // Apply Prime Number  Conditions:
            if (num <= 1) {
                continue;
            }

            boolean isPrime = true;
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}