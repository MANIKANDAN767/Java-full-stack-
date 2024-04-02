import java.util.Scanner;

public class NumberNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (0-9): ");
        int number = scanner.nextInt();

        String[] numberNames = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        if (number < 0 || number > 9) {
            System.out.println("Invalid number");
        } else {
            System.out.println("Number name: " + numberNames[number]);
        }
    }
}

OUTPUT
  Enter a number (0-9): 7
Number name: seven

=== Code Execution Successful ===
