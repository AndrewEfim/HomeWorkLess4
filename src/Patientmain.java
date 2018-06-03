import java.util.Scanner;
public class Patientmain {
    public static void main(String[] args) {
        String[]patient  =new String[9];
        System.out.println("Введите данные пациента: фамилию возраст диагноз");
        Patient.inputPatientdata(patient);
        for (int i = 0; i <patient.length ; i=i+3) {
        System.out.printf("%s%s%s\n ",patient[i],"-Возраст=",patient[i+1]); 
        }
        System.out.println("\nВведите Фамилию");
        Patient.serchPatient(patient);
 }
}
 class Patient {
    private String name;
    private String surname;
    private int age;
    private String diagnostic;
    private boolean discharged;
    Patient(String name, String sername, int age, String diagnostic, boolean discharged) {
        this.name = name;
        this.surname = sername;
        this.age = age;
        this.diagnostic = diagnostic;
        this.discharged = discharged;
    }
    public static void inputPatientdata(String[] array) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextLine();
        }
    }
    public static void serchPatient(String[] array) {
        Scanner in = new Scanner(System.in);
        String patientRequest = in.nextLine();
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(patientRequest)) {
                System.out.println(array[i] + "- Возраст =" + array[i + 1]);
            }
        }
    }
}