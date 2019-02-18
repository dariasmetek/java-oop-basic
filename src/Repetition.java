package repetition;

import java.util.Scanner;

public class Repetition {
    public static void main(String[] args) {
        //1. Instrukcje warunkowe
         // if()
        // switch-case
       //2. Pętle
         // for()
         // foreach()
         // while()
       //3. Tablica

        // deklaracja tablicy liczb calkowitych o wymiarze 10 elementow
        int numTab [] = new int[10];
        // użytkownik w pętli przypisał wartości do wszystkich komórek tablicy
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < numTab.length; i++){
            System.out.println("Podaj " + i + " element tablicy");
          //wprowadzenie wartosci calkowitej z konsoli do tablicy
            numTab[i] = sc.nextInt();
        }
        // wypisanie elementów tablicy
        for(int element : numTab){
            System.out.print(element + " ");
        }
        // w petli while wypisz tylko parzyste wartosci z tablicy
        System.out.print("\nElementy parzyste: ");
        int i = 0;
        while (i< numTab.length){
          if((numTab [i] % 2 == 0) && numTab[i] !=0){
              System.out.println(numTab[i] + " ");
          }
          i++;
        }
        //oblicz wartosc maksymalna w tablicy
        int maxVal = numTab[0];
        for (int element : numTab){
           {
               // if(element > maxVal){
                 //   maxVal = element;

                }
                maxVal = element > maxVal ? element : maxVal;
            }
            System.out.println("\nMAX VAL: " + maxVal);
        }



    }



