import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for the first number
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        // Prompt user for the second number
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        // Add the two numbers
        int sum = num1 + num2;
        
        // Display the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
    }
}
