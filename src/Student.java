public class Student {
    public static void main(String[] args) {

        SettingFaculty settingFaculty = new SettingFaculty();
        ExitMethod exitMethod = new ExitMethod();

        System.out.println("Entering the program...");
        settingFaculty.switchFaculty();

        exitMethod.exit();
    }
}
