import java.util.Scanner;

public class SettingFaculty {

    boolean valid = false;
    String faculty;

    void switchFaculty() {

        try (Scanner obScanner = new Scanner(System.in)) {

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

                    default:
                        System.out.println("Unknow Faculty!");
                        System.out.print("Please enter Mathematics or Computer Science: ");
                        faculty = obScanner.nextLine()
                                .toLowerCase()
                                .trim()
                                .replace(" ", "");
                }

            } while (!valid);
        }
    }
}
