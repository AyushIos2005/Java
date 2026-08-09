package Asg_31;

import static java.lang.System.in;
import java.util.*;
class swap{
    int a;
    int b;
    swap(int a,int b){
        this.a = a;
        this.b = b;
    }
    void swap(){
        a = a+b;
        b = a-b;
        a = a-b;
    }
}
public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number 1 : ");
        int a = sc.nextInt();
        System.out.print("Enter a number 2 : ");
        int b = sc.nextInt();
        System.out.println("Before Swapping : ");
        System.out.println("A : "+a);
        System.out.println("B : "+b);
        swap s = new swap(a,b);
        s.swap();
        System.out.println("After swapping : ");
        System.out.println("A : "+s.a);
        System.out.println("B : "+s.b);
    }
}
