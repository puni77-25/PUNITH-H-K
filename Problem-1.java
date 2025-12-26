import java.util.Scanner;

class Calculator {
    double a;
    double b;

    Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    double calculate(String operation) {
        switch (operation.toLowerCase()) {
            case "add":
                return a + b;

            case "subtract":
                return a - b;

            case "multiply":
                return a * b;

            case "divide":
                if (b == 0) {
                    System.out.println("Error: Division by zero is not allowed");
                    return 0;
                }
                return a / b;

            default:
                System.out.println("Invalid operation");
                return 0;
        }
    }
}

public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        sc.nextLine(); 

        System.out.print("Enter operation (add / subtract / multiply / divide): ");
        String operation = sc.nextLine();

        Calculator calculator = new Calculator(a, b);

        double result = calculator.calculate(operation);

        System.out.println("Result: " + result);

        sc.close();
    }
}
