import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter the number we want:");
            int num = scanner.nextInt();
            if (num == 0) {
                System.out.println("You have typed teh number we wanted you to type.");
                break;
            }
            if (num > 0 ) {
                System.out.println("Number you typed is " + num);
            }
            if (num < 0) {
                System.out.println("Please type a positive number");
            }
        }
    }
}