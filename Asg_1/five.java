/* Consider the basic pay of an employee as user input. AGP is 50% of the basic pay. The company provides 50% DA and 15% HRA on the merged basic (Basic + AGP). Write a Java program to calculate and display the total salary of the employee. */

package Asg_1;

import static java.lang.System.in;
import java.util.*;
public class five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        System.out.print("Enter Basic Pay : ");
        double basic = sc.nextDouble();

        double agp = 0.50 * basic;
        double mergebasic = basic + agp;
        double da = 0.50 * mergebasic;
        double hra = 0.15 * mergebasic;
        double totalSalary = mergebasic + da + hra;

        System.out.println("Your Total Salary : "+totalSalary);
    }
}
