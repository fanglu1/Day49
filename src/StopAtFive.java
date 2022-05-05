import java.util.Scanner;

    public class StopAtFive {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Yo, give me a number bro:");
                int num = scanner.nextInt();
                if (num == 5) {
                    System.out.println("Thank you for typing 5.");
                    break;
                }
            }
        }
    }