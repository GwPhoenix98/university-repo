package studentInfo;

import java.util.Scanner;

public class NameOfStudent {
    public String name;

    public void nameofStudent() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of Student: ");
        name = sc.nextLine();
    }

    public void displayStudentInfo(YearOfStudent yearObj) {
        System.out.println("Student: " + name +
                ", Year of birth: " + yearObj.year);
    }
}
