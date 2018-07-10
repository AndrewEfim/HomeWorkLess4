import java.util.Scanner;

public class MedicalCenter {

    private Patient patient;
    private Patient[] patients = new Patient[1];
    private Scanner in;
    private int index;

    public MedicalCenter() {
        this.in = new Scanner(System.in);
    }

    public Patient setPatient(String name, String surname, String diagnosis, int age, boolean isSick) {
        return new Patient(name, surname, diagnosis, age, isSick);
    }

    public void addPatient(Patient patient) {
        this.patients[this.index] = patient;
        index++;
    }

    public void inputPatient() {
        for (int i = 0; i < patients.length; i++) {
            System.out.println("Введите имя");
            String name = this.in.nextLine( );
            System.out.println("Введите фамилию");
            String surname = this.in.nextLine( );
            System.out.println("Введите диагноз");
            String diagnosis = this.in.nextLine( );
            System.out.println("Введите возраст");
            int age = this.in.nextInt( );
            System.out.println("Болен ли");
            boolean isSick = this.in.nextBoolean( );
            this.in.nextLine( );
            Patient patient = this.setPatient(name, surname, diagnosis, age, isSick);
            this.addPatient(patient);
        }
    }

    public void toScreen() {
        for (int i = 0; i < this.patients.length; ++i) {
            System.out.println(this.patients[i].toString( ));
        }
    }

    public void searchPatientByLastName() {
        System.out.println("Введите фамилию для поиска");
        String surNameSerch = in.next( );
        for (int i = 0; i < patients.length; i++) {
            if (patients[i].getSurname( ).equals(surNameSerch)) {
                System.out.println(patients[i].getName( ) + " " + patients[i].getSurname( ) + " " + patients[i].getDiagnosis( ) + " "
                        + patients[i].getAge( ) + " " + patients[i].isSick( ));
            }
        }
    }

    public void searchPatientByAge() {
        System.out.println("Введите возраст для поиска");
        int serchAge = in.nextInt( );
        for (int i = 0; i < patients.length; i++) {
            if (patients[i].getAge( ) == serchAge) {
                System.out.println(patients[i].getName( ) + " " + patients[i].getSurname( ) + " " + patients[i].getDiagnosis( ) + " "
                        + patients[i].getAge( ) + " " + patients[i].isSick( ));
            }
        }
    }
}


