import java.util.Scanner;
public class iw5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        switch(number){
            case 0:
                System.out.println("0");
                break;
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
             default:
                 System.out.println("Nie ma takiej liczby");
        }
    }
}
