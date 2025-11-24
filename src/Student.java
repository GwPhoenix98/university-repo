public class Student {
    public static void main(String[] args) {

        ExitMethod exitMethod             = new ExitMethod();
        SettingFaculty settingFaculty     = new SettingFaculty();
        SettingSpecialty settingSpecialty = new SettingSpecialty();
        SetStudentResults studentResults  = new SetStudentResults();

        System.out.println("Entering the program...");
        settingFaculty.switchFaculty();
        exitMethod.exit();

        settingSpecialty.switchFaculty();
        exitMethod.exit();

        studentResults.addNota();
        studentResults.displayResults();
        exitMethod.exit();
    }
}
