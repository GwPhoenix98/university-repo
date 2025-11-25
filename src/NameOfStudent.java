import java.util.Scanner;

public class NameOfStudent {
        String name;

        void nameofStudent() {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the name of Student: ");
            name = sc.nextLine();
        }
    void displayStudentInfo(YearOfStudent yearObj) {
        System.out.println("Student: " + name +
                ", Year of birth: " + yearObj.year);
    }
}
