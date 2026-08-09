package Asg_4;
import java.util.*;
class roomDemo{
    double len;
    double ber;
    roomDemo(double l,double b){
        len = l;
        ber = b;
    }

    double vol(){
        return len*ber;
    }

}
public class room {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a length of room : ");
        double l = sc.nextDouble();
        System.out.println("Enter a breath of room : ");
        double b = sc.nextDouble();
        roomDemo r1 = new roomDemo(l,b);
        double vol = r1.vol();
        System.out.println("Volume of room is : "+vol);


    }
}
