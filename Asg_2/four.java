
/*
* Write a Java program to generate the Fibonacci Series up to n terms using a loop.
* */
package Asg_2;
import java.util.*;

import static java.lang.System.in;

public class four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a nth term : ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println("Fabonacci series upto "+ n + " term  are : ");
        for(int i = 1;i <= n;i++){
            System.out.print(a+" ");
            int sum = a+b;
            b = a;
            a = sum;
//            System.out.println(0);
        }
//        System.out.println(a);
    }
}
