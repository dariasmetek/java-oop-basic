
import java.util.Scanner;

import static java.lang.Math.sqrt;
import static java.lang.StrictMath.pow;

public class jp8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Podaj wartosc zmiennej a:");
        int a = scanner.nextInt();
        System.out.println("Podaj wartosc zmiennej b:");
        int b = scanner.nextInt();
        scanner.close();

        //P1
        System.out.println(0.5*a*(a*sqrt(3)/2));
        //P2
        System.out.println(pow(a, 3));
        //P3
        int grade1 = 5;
        int grade2 = 5;
        int grade3 = 4;
        System.out.println((grade1 + grade2 + grade3)/3);
        //P4
        System.out.println(a * b);
        //P5
        double salary_net = 8000;
        int vat_tax = 23;
        System.out.println(salary_net * (1 + ((double)vat_tax)/100));




    }
}
