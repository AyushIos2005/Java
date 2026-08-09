package Asg_31;
import java.util.*;
import static java.lang.System.in;

class Room{
    double width;
    double depth;
    double height;

    Room(double width,double depth,double height){
        this.width = width;
        this.depth = depth;
        this.height = height;
    }
    double volume(){
        return width*depth*height;
    }
}
public class third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Room R1;

        System.out.println("Enter a width of a room : ");
        double w = sc.nextInt();
        System.out.println("Enter a height of a room : ");
        double h = sc.nextInt();
        System.out.println("Entre a depth of a room :  ");
        double d = sc.nextInt();

        R1= new Room(w,d,h);
        System.out.println("Volume of Room is : "+R1.volume());
    }
}
