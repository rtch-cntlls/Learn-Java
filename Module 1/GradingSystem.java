import java.util.Scanner;

public class GradingSystem {
     public static void main(String[] args) {
          try (Scanner scanner = new Scanner(System.in)) {
               System.out.print("Enter student name: ");
               String name = scanner.nextLine().trim();

               int grade;
               while (true) {
                    System.out.print("Enter student grade (0-100): ");
                    if (!scanner.hasNextInt()) {
                         System.out.println("Please enter a whole number.");
                         scanner.next();
                         continue;
                    }

                    grade = scanner.nextInt();
                    if (grade >= 0 && grade <= 100) {
                         break;
                    }
                    System.out.println("Grade must be between 0 and 100.");
               }

               System.out.println("Student: " + name);
               System.out.println("Grade: " + grade);
               System.out.println("Result: " + getResult(grade));
        }
     }

     private static String getResult(int grade) {
          if (grade >= 90) {
               return "Excellent";
          } else if (grade >= 85) {
               return "Very Good";
          } else if (grade >= 80) {
               return "Good";
          } else if (grade >= 75) {
               return "Passed";
          }
          return "Failed";
    }
}
