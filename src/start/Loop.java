import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int key = -1;
            while(key !=0){
            System.out.println("Co chcesz zrobic: \n(1) Zadanie1 \n(2) Zadanie2 \n(0) Wyjscie");
            //klucz do instrukcji switch-case
            key = scanner.nextInt();

            switch (key) {
                case 1:
                    System.out.println("Rozwiazanie zadania 1");
                    break;
                case 2:
                    System.out.println("Rozwiazanie zadania 2");
                    break;
                case 0:
                    System.out.println("Wyjscie");
                    break;
                default:
                    System.out.println("Bledny wybor");

            }
        }
    }

}
