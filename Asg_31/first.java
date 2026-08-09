package Asg_31;
import java.util.*;
public class first{
    static int fact(int n){
        if(n == 0 || n == 1) return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an number : ");
        int n = sc.nextInt();
        int factorial = fact(n);
        System.out.println("Factorical of "+n+" : " +factorial);
    }
}