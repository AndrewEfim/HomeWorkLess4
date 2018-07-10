import java.util.Scanner;

public class Menu {

    public void StartMenu() {
        Scanner inmenu = new Scanner(System.in);
        MedicalCenter medicalCenter = new MedicalCenter( );
        medicalCenter.inputPatient( );
        medicalCenter.toScreen( );
        System.out.println("Выбирете по какому параметру производить поиск : 1-по Фамилии 2- по возрасту 3 выход");
     do {
            if (inmenu.nextInt()==1)
            {
                medicalCenter.searchPatientByLastName( );
            }
            if (inmenu.nextInt() == 2) {
                medicalCenter.searchPatientByAge( );
            } else {
                System.out.println("Вы не выбрали нужную вам операцию");
            }
        }while(inmenu.nextInt()!=3);
    }
}
