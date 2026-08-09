/*
b. In general, an equation of the form ax2 + bx + c = 0 is known as a quadratic equation.
Accept the values of a, b, and c from the user and write a Java program to calculate
the roots of the given quadratic equation.
* */

package Asg_2;

import static java.lang.System.in;
import java.util.*;
public class two {
    static boolean isAvalid(int a){
        if(a < 0 ) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a co-effect of  x^2 term : ");
        int a = sc.nextInt();
        System.out.println("Enter a co-effect of x term : ");
        int b = sc.nextInt();
        System.out.println("Enter a constant term : ");
        int c = sc.nextInt();

        boolean flag = isAvalid(a);
        if(flag == true){
            double  dis = (b*b) - (4*a*c);
            double x1 = (-b + Math.sqrt(dis))/(2*a);
            double x2 = (-b - Math.sqrt(dis))/(2*a);
            if(dis > 0){
                System.out.println("Roots are real and distrcnt ");
                System.out.println("Root 1 : "+x1);
                System.out.println("Root 2 : "+x2);
            }
            else if(dis == 0){
                System.out.println("Root are equall and real ");
                System.out.println("Root 1 : "+x1);
                System.out.println("Root 2 : "+x2);
            }
            else{
                System.out.println("Roots are complex ");
            }
        }
        else{
            System.out.println("The co-effec are not for Qudractic eqn");
        }
    }
}
