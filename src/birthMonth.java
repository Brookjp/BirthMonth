import java.util.Scanner;

public class birthMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int monthOfBirth = 0;

        while (true) {
            System.out.print("Enter your birth month (1-12): ");

            try {
                monthOfBirth = Integer.parseInt(scanner.nextLine());

                if (monthOfBirth >= 1 && monthOfBirth <= 12) {
                    break;
                } else {
                    System.out.println("You did not enter a number between 1 and 12.");
                }
            } catch (NumberFormatException e) {
                System.out.println("You did not enter a number.");
            }
        }

        System.out.printf("Your birth month is: %d\n", monthOfBirth);
    }
}