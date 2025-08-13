
import java.util.Scanner;

public class Swap2Num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First number (A): ");
        Integer num1 = input.nextInt();
        System.out.print("Enter Second number (B): ");
        Integer num2 = input.nextInt();

        int c = num2;
        num2 = num1;
        num1 = c;

        System.out.println("------Swapped numbers------");
        System.out.println("Value of A is " +num1);
        System.out.println("Value of B is " +num2);

    }
}
