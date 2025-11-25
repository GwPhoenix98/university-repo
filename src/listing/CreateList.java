package listing;

import exitMethod.ExitMethod;
import studentInfo.NameOfStudent;
import studentInfo.SetStudentResults;
import studentInfo.YearOfStudent;
import studentInfo.SetGroupName;
import univrsityInfo.SettingFaculty;
import univrsityInfo.SettingSpecialty;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreateList {

    ExitMethod exitMethod             = new ExitMethod();
    SettingFaculty settingFaculty     = new SettingFaculty();
    SettingSpecialty settingSpecialty = new SettingSpecialty();
    SetStudentResults studentResults  = new SetStudentResults();
    NameOfStudent nameOfStudent       = new NameOfStudent();
    YearOfStudent yearOfStudent       = new YearOfStudent();
    SetGroupName settingGroup         = new SetGroupName();
    List<StudentCard> cards           = new ArrayList<>();
    Scanner obScanner                 = new Scanner(System.in);

    public void menageList() {

        boolean run = true;

        while (run) {

            settingFaculty.switchFaculty();
            String faculty = settingFaculty.faculty;
            exitMethod.exit();

            settingSpecialty.switchSpecialty();
            String specialty = settingSpecialty.specialty;

            settingGroup.setGroup();
            String groupName = settingGroup.groupName;
            exitMethod.exit();

            nameOfStudent.nameofStudent();
            String name = nameOfStudent.name;

            yearOfStudent.setYear();
            int year = yearOfStudent.year;

            nameOfStudent.displayStudentInfo(yearOfStudent);

            studentResults.addNote();
            int note = studentResults.examNote;

            studentResults.displayResults();
            exitMethod.exit();

            addCard(name, year, faculty, specialty, groupName, note);

            System.out.print("Add another? (yes/no): ");
            String response = obScanner.nextLine();

            if (response.equalsIgnoreCase("no")) {
                run = false;
            }
        }

        displayAllCards();

    }

    public void addCard(String name,
                 int year,
                 String faculty,
                 String specialty,
                 String groupName,
                 int note) {

        cards.add(new StudentCard(name, year, faculty, specialty, groupName, note));
    }

    public void displayAllCards() {
        System.out.println("\n--- All Student Cards ---");
        for (StudentCard card : cards) {
            System.out.println(card);
        }
    }
}



