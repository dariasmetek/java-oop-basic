package controller;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class DateTimeController {
    public int getAgeFromStringDate(String date){
        LocalDate birthdate = LocalDate.parse(date);
        LocalDate today = LocalDate.now();
        Period age = Period.between(birthdate, today);
        System.out.println(age);

        return age.getYears();

    }

    public LocalDate dateComparator(String d1, String d2){
        LocalDate date1 = LocalDate.parse(d1);
        LocalDate date2 = LocalDate.parse(d2);
        return date1.isBefore(date2) ? date1 : date2;
    }
      //Ile poniedzialkow wystepuje pomiedzy dwiema datami
    public int getMondaysBetweenDates(String d1, String d2) {
        LocalDate date1 = LocalDate.parse(d1);
        LocalDate date2 = LocalDate.parse(d2);
        //sprawdzam ktora data jest mniejsza
        LocalDate lessDate = date1.isBefore(date2) ? date1 : date2;
        LocalDate greaterDate = date1.isAfter(date2) ? date1 : date2;
        //licznik poniedzialkow
        int mondayCounter = 0;
        //inicjalizujemy petle date mniejsza
        //warunkiem wykonania petli jest sprawdzenie czy data mniejsza nie przekroczyla daty wiekszej
        //w kroku dodaje 1 dzien
        for (LocalDate ld = lessDate; ld.isBefore(greaterDate); ld = ld.plusDays(1)){
            if(ld.getDayOfWeek() == DayOfWeek.MONDAY){
                mondayCounter++;
            }
        }
        return mondayCounter;
    }


    public static void main (String[] args){
        DateTimeController dtc = new DateTimeController();
        System.out.println("Twoj wiek dokladny to: " + dtc.getAgeFromStringDate("2000-10-01") + " lat");
        System.out.println("Wczesniejsza data:" + dtc.dateComparator("2000-02-20", "2001-05-05"));
        System.out.println("Wczesniejsza data:" + dtc.dateComparator("2010-02-20", "2001-05-05"));
        System.out.println("Liczba poniedzialkow miedzy datami:" + dtc.getMondaysBetweenDates("2019-02-19", "2019-03-05"));
    }
}
