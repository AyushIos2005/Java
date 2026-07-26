/*
Write a Java program which takes the radius of a Circle as user input and calculates the area and perimeter to display the results.
* */

package Asg_1;

import static java.lang.System.in;
import java.util.*;
public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Radius of Circle : ");
        double r = sc.nextDouble();
        double area = Math.PI * r * r;
        double permeter = Math.PI * 2 * r;

        System.out.println("Area of Circle : "+area);
        System.out.println("Permeter of Circle : "+permeter);

    }
}
