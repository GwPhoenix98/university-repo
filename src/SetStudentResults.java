import java.util.Scanner;

public class SetStudentResults {

    private int test1Note,
                test2Note,
                examNote;
    Scanner obScanner = new Scanner(System.in);

    void addNota() {

        this.test1Note = getValidNote("Enter the grade from the first test: ");
        this.test2Note = getValidNote("Enter the grade from the second test: ");
        this.examNote  = getValidNote("Enter the grade from the exam: ");
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

    void displayResults() {

        System.out.println("\n--- Student Results ---");
        System.out.println("Test 1: " + test1Note);
        System.out.println("Test 2: " + test2Note);
        System.out.println("Exam:   " + examNote);
    }
}
