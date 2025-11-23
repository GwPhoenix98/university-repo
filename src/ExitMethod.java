import java.util.Scanner;

public class ExitMethod {

    void exit() {

        try (Scanner obScanner = new Scanner(System.in)) {

            System.out.print("Do you want to exit the program? (Yes / No): ");
            String response = obScanner.nextLine().replace(" ", "");

            while (true) {
                if (response.equalsIgnoreCase("yes")) {
                    System.out.println("The program is closing!");
                    System.exit(0);
                } else if (response.equalsIgnoreCase("no")) {
                    System.out.println("The program will continue.");
                    break;
                } else {
                    System.out.print("Invalid input. Please type Yes or No: ");
                    response = obScanner.nextLine().replace(" ", "");
                }
            }
        }
    }
}
