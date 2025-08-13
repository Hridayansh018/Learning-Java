import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        Integer a;
        Integer b;

        System.out.print("Enter number (A): ");
        a = input.nextInt();
        System.out.print("Enter number (B): ");
        b = input.nextInt();

        System.out.println("================================");
        System.out.println("Addition = " + (a+b));
        System.out.println("Subtraction = " + (a-b));
        System.out.println("Multiplication = " + (a*b));
        System.out.println("Division = " + (a/b));
        System.out.println("Remainder = " + (a%b));
        System.out.println("================================");
    }
}