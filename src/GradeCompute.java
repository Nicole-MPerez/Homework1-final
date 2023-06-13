import java.util.Scanner;
public class GradeCompute {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Homework is: ");
        int Homework = scanner.nextInt();
        System.out.println("CodeLab is: ");
        int CodeLab = scanner.nextInt();
        System.out.println("Midterm 1 is: ");
        int Midterm1 = scanner.nextInt();
        System.out.println("Midterm 2 is: ");
        int Midterm2 = scanner.nextInt();
        int total = Homework + CodeLab + Midterm1 + Midterm2;
        System.out.println("The total score is " + total + " of possible 60 points");


    }
}
