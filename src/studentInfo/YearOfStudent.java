package studentInfo;

import java.util.Scanner;

public class YearOfStudent {

    public int year;

    public void setYear() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year of Student: ");
        year = sc.nextInt();
    }

}
