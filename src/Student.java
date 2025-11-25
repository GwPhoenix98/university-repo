public class Student {
    public static void main(String[] args) {

        ExitMethod exitMethod             = new ExitMethod();
        SettingFaculty settingFaculty     = new SettingFaculty();
        SettingSpecialty settingSpecialty = new SettingSpecialty();
        SetStudentResults studentResults  = new SetStudentResults();
        NameOfStudent nameOfStudent       = new NameOfStudent();
        YearOfStudent yearOfStudent       = new YearOfStudent();

        System.out.println("Entering the program...");
        settingFaculty.switchFaculty();
        exitMethod.exit();

        settingSpecialty.switchFaculty();
        exitMethod.exit();

        nameOfStudent.nameofStudent1();

        yearOfStudent.setYear();

        nameOfStudent.displayStudentInfo(yearOfStudent);

        studentResults.addNota();
        studentResults.displayResults();
        exitMethod.exit();
    }
}
