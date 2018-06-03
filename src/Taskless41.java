import java.util.Arrays;
import java.util.Scanner;
public class Taskless41 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Taskless41.inputmethod(numbers);//ввод чисел
        Taskless41.outMetod(numbers);//вывод
        Taskless41.bubleSort(numbers);//сортировка
        Taskless41.outMetod(numbers);//вывод
    }
    public static void inputmethod(int[] array) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
    }
    public static void outMetod(int[] array) {
            System.out.println(Arrays.toString(array));
    }
    public static void bubleSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;}
                }
            }
    }   
}