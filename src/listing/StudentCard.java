package listing;

public class StudentCard {

    private String name,
                   faculty,
                   specialty,
                   groupName;
    private int year,
                studentNote;

    public StudentCard(String name,
                       int year,
                       String faculty,
                       String specialty,
                       String groupName,
                       int studentNote) {
        this.name = name;
        this.year = year;
        this.faculty = faculty;
        this.specialty = specialty;
        this.groupName = groupName;
        this.studentNote = studentNote;

    }

    public String displayCard() {
        return  "Name: " + name + "\n" +
                "Year: " + year + "\n" +
                "Faculty: " + faculty + "\n" +
                "Specialty: " + specialty + "\n" +
                "Group: " + groupName + "\n" +
                "Notes: " + studentNote;
    }
}
