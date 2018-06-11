import java.util.Scanner;

public class Patientmain {
    public static void main(String[] args) {
        int size = 3;
        int i =0;
        Scanner in = new Scanner(System.in);
        Patient[] list = new Patient[size];
        System.out.print("Введите фамилию возраст и диагноз пациента\n");
        InOut.inputInfo(list,in,i);
        InOut.outList(list);
        System.out.print("Введите Фамилию для поиска\n");
        list[i].serchSurName(list,in);
        System.out.print("Введите возраст для поиска\n");
        list[i].serchAge(list,in);
    }
}

 class Patient {

    private String name;
    private String surName;
    private int age;
    private String diagnostic;
    private boolean discarged;

     Patient(String surName, int age, String diagnostic) {
        this.name = name;
        this.age = age;
        this.diagnostic = diagnostic;
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public void serchAge(Patient[] array, Scanner in) {
        int serchAge = in.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i].getAge() == (serchAge))
                System.out.print(array[i].getSurName() + " " + array[i].getAge() + " " + array[i].getDiagnostic() + "\n");
        }
    }

    public void serchSurName(Patient[] array, Scanner in) {
        String surNameSerch = in.next();
        for (int i = 0; i < array.length; i++) {
            if (array[i].getSurName().equals(surNameSerch)) {
                System.out.print(array[i].getSurName() + " " + array[i].getAge() + " " + array[i].getDiagnostic() + "\n");

            }
        }
    }
}
 class InOut {
    public static void inputInfo(Patient[] array, Scanner in, int i) {
        do {
            array[i] = new Patient(in.next(), in.nextInt(), in.next());
            i++;
        } while (i < array.length);
    }

    public static void outList(Patient[] array) {
        for (Patient e : array) {
            System.out.println(" " + e.getSurName() + " " + "-Возраст=" + " " + e.getAge() + "\n");
        }
    }
}