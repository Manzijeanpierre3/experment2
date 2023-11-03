import java.util.Scanner;

public class ass4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a number (negative number to exit): ");
            number = scanner.nextInt();

            if (number >= 0) {
                int square = number * number;
                System.out.println("The square of " + number + " is " + square);
            }

        } while (number >= 0);

        System.out.println("Program exited.");
    }
}
