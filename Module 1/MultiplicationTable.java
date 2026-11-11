import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            int number;
            System.out.print("Enter a number: ");

            for (; !scanner.hasNextInt(); ) {
                System.out.print("Please enter a number only: ");
                scanner.next();
            }

            number = scanner.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        }
    }
}
