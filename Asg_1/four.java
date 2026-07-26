//Write a Java program to swap two variables with and without using a third variable.
package Asg_1;
import java.util.*;
import static java.lang.System.in;

public class four {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number 1 : ");
        int a = sc.nextInt();
        System.out.print("Enter a number 2 : ");
        int b = sc.nextInt();
        System.out.println();
        System.out.println("Before Swapping : ");
        System.out.println("number 1 : "+a);
        System.out.println("number 2 : "+b);

        /*With extra variable*/
//        int temp = a;
//        a = b;
//        b = temp;

        /*With extra variable */

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swapping : ");
        System.out.println("number 1 : "+a);
        System.out.println("number 2 : "+b);
    }
}
