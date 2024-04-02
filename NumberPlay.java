import java.util.Scanner;

class NumberPlay {
    private int number;

    public NumberPlay(int number) {
        this.number = number;
    }

    public int calculateDifference() {
        if (number < 10 || number > 99) {
            System.out.println("Invalid number");
            return -1;
        }

        if (number > 50) {
            int firstDigit = number / 10;
            int secondDigit = number % 10;
            return Math.abs(firstDigit - secondDigit);
        } else {
            int reversedNumber = (number % 10) * 10 + (number / 10);
            int firstDigit = reversedNumber / 10;
            int secondDigit = reversedNumber % 10;
            return Math.abs(firstDigit - secondDigit);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a two-digit integer: ");
        int inputNumber = scanner.nextInt();

        NumberPlay numberPlay = new NumberPlay(inputNumber);
        int difference = numberPlay.calculateDifference();
        if (difference != -1) {
            System.out.println("Difference between digits: " + difference);
        }
    }
}
