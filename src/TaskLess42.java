public class TaskLess42 {
    public static void main(String[] args) {
        int N = 365;
        System.out.println("Количество страниц =" +TaskLess42.guantityPages(N));
    }
    public static int guantityPages(int N) {
        int numbersOfpages = (N / 10) + 1;
        return numbersOfpages;
    }
}