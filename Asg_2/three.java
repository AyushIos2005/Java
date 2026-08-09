//Write a Java program to check whether a year is a Leap Year or not.
package Asg_2;

import static java.lang.System.in;
import java.util.*;
public class three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Enter a year : ");
        year = sc.nextInt();

        if(year % 400 == 0 || (year % 4== 0 && year % 100 != 0)){
            System.out.println(year+" is a leap year ");
        }
        else{
            System.out.println(year+ " is not a leap year");
        }
    }
}
