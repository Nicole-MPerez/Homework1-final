import java.util.Scanner;
public class RectangleCompute {
    public static void main (String[] args){
        Scanner rectangle = new Scanner(System.in);
        System.out.println("width");
        int width = rectangle.nextInt();
        System.out.println("length");
        int length = rectangle.nextInt();
        int area = width * length;
        int perimeter = (width * 2) + (length * 2);
        System.out.println("When one side is " + width + "and the other side is " + length + " the area is  " + area + " and the perimeter is " + perimeter + " . ");

    }
}
