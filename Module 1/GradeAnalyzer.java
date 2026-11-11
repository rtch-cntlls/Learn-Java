import java.util.Scanner;

public class GradeAnalyzer {
    public static void main(String[] args){

        try (Scanner scanner = new Scanner(System.in)){
            int[] grades = new int[5];
            for (int i = 1; i <= 5; i++) {
                System.out.print("Enter grade " + i + ": ");
                grades[i - 1] = scanner.nextInt();
            }
            int sum = 0;
            double average = 0;
            System.out.print("Grades: ");
            for (int grade : grades) {
                System.out.print(grade + ", ");
                sum += grade;
            }
            average = (double) sum / grades.length;
            System.out.println();
            System.out.println("Total: " + sum);
            System.out.println("Average: " + average);

        }
    }
}
