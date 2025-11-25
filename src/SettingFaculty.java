import java.util.Scanner;

public class SettingFaculty {

    boolean valid = false;
    String faculty;
    String groupName;

    void switchFaculty() {
        Scanner obScanner = new Scanner(System.in);
        System.out.print("Enter the faculty (Mathematics / Computer Science): ");
        faculty = obScanner.nextLine()
                .toLowerCase()
                .trim()
                .replace(" ", "");

        do {
            switch (faculty) {

                case "mathematics":
                    faculty = "Mathematics";
                    System.out.println("Your faculty is " + faculty + ".");
                    valid = true;
                break;

                case "computerscience":
                    faculty = "Computer Science";
                    System.out.println("Your faculty is " + faculty + ".");
                    valid = true;
                break;

                default: System.out.println("Unknow Faculty!");
                System.out.print("Please enter Mathematics or Computer Science: ");
                faculty = obScanner.nextLine()
                        .toLowerCase()
                        .trim()
                        .replace(" ", "");
            }

        } while (!valid);
        System.out.println("do you want to add new students? (Yes/No):");
        String answer = obScanner.nextLine();

        if (answer.equalsIgnoreCase("No")){
            System.out.println("Exting program...");
            return;
        }
        System.out.println("Create the new grup name: ");
        groupName = obScanner.nextLine();

        System.out.println("Group created successufully: " + groupName);
        System.out.println("Continuing program...");


    }
}

