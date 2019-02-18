import controller.CarController;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        //GUI
        Scanner sc = new Scanner(System.in);
        System.out.println("AUTO FACTORY");
        boolean flag = true;
        while(flag) {
            System.out.println("1.Zamowienie auta \n2.Lista zamowien \n0.Wyjscie");
            //odczyt wartosci ze skanera
            int decision = sc.nextInt();
            //konsumpcja \n
            sc.nextLine();
            //utworzenie obiektu kontrolera
            CarController cc = new CarController();
            switch(decision){
                case 1:
                    //wczytanie brand, model, price, year ze skanera
                    System.out.println("Podaj marke");
                    String brand = sc.nextLine();
                    System.out.println("Podaj model");
                    String model = sc.nextLine();
                    System.out.println("Podaj cene");
                    double price = sc.nextDouble();
                    System.out.println("Podaj rok");
                    int year = sc.nextInt();
                    sc.nextLine();
                    cc.purchaseCar(brand, model, price, year);
                    break;
                case 2:
                    //odwolanie sie do skladowej statycznej
                    System.out.println(CarController.index);
                    cc.getCars();
                    break;
                case 0:
                    flag = false;
                    break;
                 default:
                     System.out.println("Bledny wybor");

            }
        }
    }
}
