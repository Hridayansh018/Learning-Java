import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        Integer num1 = input.nextInt();
        System.out.print("Enter second number : ");
        Integer num2 = input.nextInt();
        int result;
        result = num1 + num2;
        System.out.println("The sum of " + num1 +" and " + num2 + " is " + result);
    }
}