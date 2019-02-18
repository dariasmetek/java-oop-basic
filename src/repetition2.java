package repetition2;

import java.util.Scanner;

public class repetition2 {
    public static void main(String[] args) {
        // 1. Instrukcje warunkowe
        // if()
        // switch-case
        // 2. Pętle
        // for()
        // foreach()
        // while()
        // do while()
        // 3. Tablica

        // deklaracja tablicy liczb całkowitych o wymatrze 10 elementów
        int numTab [] = new int[10];
        // użytkownik w pętli przypisał wartości do wszystkich komórek tablicy
        // otwarcie skanera do wprowadzanie z konsoli do programu
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < numTab.length; i++){
            System.out.println("Podaj " + i + " element tablicy");
            // wprowadzenie wartości całkowitej z konsoli do tablicy
            numTab[i] = sc.nextInt();
        }
        // wypisanie elementów tablicy
        for(int element : numTab){
            System.out.print(element + " ");
        }
        // w pętli while wypisz tylko parzyste wartości z tablicy
        System.out.print("\nElementy parzyste: ");
        int i = 0;
        while (i < numTab.length){
            if((numTab[i] % 2 == 0) && numTab[i] != 0){
                System.out.print(numTab[i] + " ");
            }
            i++;
        }
        // oblicz wartośc maksymalną w tablicy
        int maxVal = numTab[0];
        for (int element : numTab){
//            if(element > maxVal){
//                maxVal = element;
//            }
            maxVal = element > maxVal ? element : maxVal;
        }
        System.out.println("\nMAX VAL: " + maxVal);

        // oblicz średnią arytmetyczną wszystkich elementów tablicy
        int sum = 0;
        for(int element : numTab){
            sum = sum + element;
        }
        System.out.println("AVG: " + (double)sum/numTab.length);
    }
}