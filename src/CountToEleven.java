import java.util.Scanner;

public class CountToEleven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        while (true) {
            System.out.println("Enter a number that is less than 11:");
            num = scanner.nextInt();
            if (num > 11) {
                System.out.println("Follow the instructions!!!");
            } else
                break;
        }
            for (int i = num; i <= 11; i++) {
                System.out.println(i);
            }

    }
}