import java.util.Scanner;

public class TakeABreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        while (true) {
            System.out.println("Do you want to take a break?");
            String word = scanner.nextLine();
            if (word.equalsIgnoreCase("yes")) {
                System.out.println("You deserve a break!");
                break;
            }
        }
    }
}
