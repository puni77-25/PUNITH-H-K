import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a: ");

        if (!sc.hasNextInt()) {
            System.out.println("Please enter a whole number only.");
            return;
        }

        int a = sc.nextInt();
        if (a <= 0) {
            System.out.println("Please enter a positive whole number greater than 0.");
            return;
        }
        for (int i = 0; i < a; i++) {
            System.out.print(2 * i + 1);
            if (i < a - 1) {
                System.out.print(", ");
            }
        }

        sc.close();
    }
}
