import java.io.IOException;
import java.util.Scanner;

public class MyProfile {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Your Name: ");
        String name = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Course: ");
        String mycourse = scanner.nextLine();

        System.out.print("Programming Skills: ");
        String skills = scanner.nextLine();

        System.out.print("Hello, I'm " + name + ", I'm " + age + " years old.\n");
        System.out.print("Course: " + mycourse + "\n");
        System.out.print("My Skills: " + skills);

        scanner.close();
    }
}
