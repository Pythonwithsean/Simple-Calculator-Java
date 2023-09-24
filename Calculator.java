
// Import the java libary that allows me to collect user inputs 
import java.util.Scanner;

public class Calculator {

    private static Scanner scanner = new Scanner(System.in);

    // Collect User Input
    public static void collectInput(String operation) {

        System.out.print("Enter the first number: ");
        try {
            Integer num1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Your first Number is " + num1);
            System.out.print("Enter the second number: ");
            Integer num2 = Integer.parseInt(scanner.nextLine());
            System.out.println("Your second Number is " + num2);

            try {
                switch (operation) {
                    case "+":
                        System.out.println("The Result is" + (num1 + num2));
                        break;
                    case "-":
                        System.out.println("The Result is" + (num1 - num2));
                        break;
                    case "/":
                        System.out.println("The Result is" + (num1 / num2));
                        break;
                    case "*":
                        System.out.println("The Result is" + (num1 * num2));
                        break;
                    default:
                        System.out.println("Invalid Opperand");

                }
            } catch (Exception e) {
                System.out.println(e);
            }

        } catch (Exception e) {
            System.out.println("Errror! " + e);

        }
    }

    public static String collectOperation() {
        System.out.print("Enter an Operation: ");
        try {
            String operator = scanner.nextLine();

            switch (operator) {
                case "+":
                    operator = "+";
                    break;
                case "-":
                    operator = "-";
                    break;
                case "/":
                    operator = "/";
                    break;
                case "*":
                    operator = "*";
                    break;
                default:
                    System.out.println("Invalid Operand");
            }
            return operator;
        } catch (Exception e) {
            return String.valueOf(e);
        }
    }

    public static void main(String[] args) {
        String operation = collectOperation();
        collectInput(operation);

        scanner.close();
    }
}
