//Write a Java program to identify the largest among three numbers using the
//Conditional Operator.

package Asg_2;
import java.util.*;
public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number 1 : ");
        int a = sc.nextInt();
        System.out.print("Enter a number 2 : ");
        int b = sc.nextInt();
        System.out.print("Enter a number 3 : ");
        int c = sc.nextInt();
        System.out.println();
        if(a > b  && a > c )
            System.out.println(a+" is a greater number ");
        else if(b > a && b> c)
            System.out.println(b+" is a greater number ");
        else{
            System.out.println(c+"is a greater number ");
        }
    }
}
