import java.util.Scanner;
public class CircleCompute {
    public static void main (String[] args){
         Scanner circle = new Scanner (System.in);
     //    System.out.println("radius");
       double radius = circle.nextDouble();
        // double radius = 4.0;
        double area = Math.PI*(radius*radius);
        double circumference = 2*radius*Math.PI;
        System.out.printf("when the  radius is %f the area is %f and the circumference is %f.",radius,area,circumference);
    }
}
