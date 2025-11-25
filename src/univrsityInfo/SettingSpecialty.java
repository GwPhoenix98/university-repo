package univrsityInfo;

import java.util.Scanner;

public class SettingSpecialty {

    boolean valid = false;
    public String specialty;

    public void switchSpecialty() {

        Scanner obScanner = new Scanner(System.in);

        System.out.print("Enter the specialty (Algebra/Geometry/Integral Calculus): ");
        specialty = obScanner.nextLine()
                    .toLowerCase()
                    .trim()
                    .replace(" ", "");

        do {
            switch (specialty) {

                case "algebra":
                    specialty = "Algebra";
                    System.out.println("Your specialty is " + specialty + ".");
                    valid = true;
                    break;

                case "geometry":
                    specialty = "Geometry";
                    System.out.println("Your specialty is " + specialty + ".");
                    valid = true;
                    break;

                case "integralcalculus":
                    specialty = "Integral Calculus";
                    System.out.println("Your specialty is " + specialty + ".");
                    valid = true;
                    break;

                default:
                    System.out.println("Unknow Specialty!");
                    System.out.print("Please enter Algebra, Geometry or Integral Calculus: ");
                    specialty = obScanner.nextLine()
                                .toLowerCase()
                                .trim()
                                .replace(" ", "");

            }
        } while (!valid);
    }
}

