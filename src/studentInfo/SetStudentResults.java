package studentInfo;

import java.util.Scanner;

public class SetStudentResults {

    int         test1Note,
                test2Note;
    public int  examNote;
    Scanner obScanner = new Scanner(System.in);

    public void addNote() {

        test1Note = getValidNote("Enter the grade from the first test: ");
        test2Note = getValidNote("Enter the grade from the second test: ");
        examNote  = getValidNote("Enter the grade from the exam: ");
    }

    int getValidNote(String message) {

        System.out.print(message);
        int note = obScanner.nextInt();

        while (note < 0 || note > 10) {
            System.out.print("Please enter a valid note (0 - 10): ");
            note = obScanner.nextInt();
        }

        return note;
    }

    public void displayResults() {

        System.out.println("\n--- Student Results ---");
        System.out.println("Test 1: " + test1Note);
        System.out.println("Test 2: " + test2Note);
        System.out.println("Exam:   " + examNote);
    }
}
