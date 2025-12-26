import java.util.Scanner;

public class Problem_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");

        if (!sc.hasNextInt()) {
            System.out.println("Please enter a whole number only.");
            return;
        }

        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be greater than 0.");
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter " + n + " whole numbers:");

        for (int i = 0; i < n; i++) {
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter whole numbers only.");
                return;
            }
            arr[i] = sc.nextInt();
        }
        int[] count = new int[10];
        for (int i = 1; i <= 9; i++) {
            for (int num : arr) {
                if (num % i == 0) {
                    count[i]++;
                }
            }
        }
        System.out.print("{");
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + ": " + count[i]);
            if (i < 9) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        sc.close();
    }
}
