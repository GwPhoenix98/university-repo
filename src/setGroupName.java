import java.util.Scanner;

public class setGroupName {

    String groupName;

    Scanner obScanner = new Scanner(System.in);

    void setGroup() {
        System.out.println("do you want to add new students? (Yes/No):");
        String answer = obScanner.nextLine();

        if (answer.equalsIgnoreCase("No")) {
            System.out.println("Exting program...");
            return;
        }

        System.out.println("Create the new grup name: ");
        groupName = obScanner.nextLine();

        System.out.println("Group created successufully: " + groupName);
        System.out.println("Continuing program...");
    }
}

