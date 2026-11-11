import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int firstnum, secondnum;

        System.out.print("Enter first Number: ");
        firstnum = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter second Number: ");
        secondnum = scanner.nextInt();  
        scanner.nextLine();

        System.out.println(firstnum + secondnum);
        System.out.println(firstnum - secondnum);
        System.out.println(firstnum * secondnum);
        System.out.println(firstnum / secondnum);

        scanner.close();
    }
}
