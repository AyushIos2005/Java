package Asg_4;
import java.util.*;

import static java.lang.System.in;

//constructor overloading
class rect{
//    square matrix
    int n;
    int r;
    int c;
    char ch;

    rect(int n,char ch){
        this.n = n;
        this.ch = ch;
        for(int i =0;i < n;i++){
            for(int j = 0;j <n;j++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    //rectangle
    rect(int r,int c,char ch){
        this.r = r;
        this.c =c;
        this.ch = ch;
        for(int i = 0;i < r;i++){
            for(int j =0;j < c;j++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }

    }
}
public class asg_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no of rows : ");
        int r = sc.nextInt();
        System.out.println("Enter a no of colums : ");
        int c = sc.nextInt();
        System.out.println("Enter  a character to be print : ");
        char ch = sc.next().charAt(0);
        if(r == c){
            rect r1 = new rect(r,ch);
        }
        else{
            rect r2 = new rect(r,c,ch);
        }
    }
}
