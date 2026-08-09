/*
* Write a Java program to reverse a number and check whether it is a Palindrome.
* */

package Asg_3;

import static java.lang.System.in;
import java.util.*;
public class two {
    static int reverse(int n){
        int temp = n;
        int rev = 0;
        while(n > 0){
            int digit = n % 10;
            rev = rev*10+digit;
            n = n/10;
        }
        System.out.println("Reverse of  "+temp+" is : "+rev);
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int rev = reverse(n);
        if(rev == n){
            System.out.println("It is a paildrone number");
        }
        else{
            System.out.println("It is not a paildrone number");
        }
    }
}
