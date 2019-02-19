package controller;

import model.User;

import java.time.LocalDate;
import java.time.LocalDateTime;
public class UserController {
    User users[] = new User[100];
    int index;

    public void addUser(String name, String lastname, String login, String password, String email, String phone, LocalDate birth_date, LocalDateTime registration_date_time) {
        User u = new User(name, lastname, login, password, email, phone, birth_date, registration_date_time);
        // System.out.print(u);
        u.setRegistration_date_time(u.getRegistration_date_time().plusHours(1));
        users[index] = u;
        index++;
    }

    public void getAllUsers() {
        for (int i = 0; i < index; i++) {
            System.out.println(users[i]);
        }
    }

    //metoda porownujaca daty urodzenia dwoch uzytkownikow
    //jezeli pierwsza data jest < od drugiej-> true
    //w przeciwnym razie -> false
    public boolean birthdateComparator(User u1, User u2) {
        return u1.getBirth_date().isBefore(u2.getBirth_date());
    }

    public boolean birthdateComparator(int index1, int index2) {
        return users[index1].getBirth_date().isBefore(users[index2].getBirth_date());
    }

    //sortowanie po dacie
    public void sortByBirthdate(){

        for (int j = 0; j < index; j++) {
            for (int i = 1; i < index; i++) {
                //sprawdzenie czy pierwszy jest mlodszy od drugiego
                if (birthdateComparator(i - 1, i)) {
                    //tymczasowy element pierwszy w porownaniu
                    User u1 = users[i - 1];
                    //tymczasowy element drugi w porownaniu
                    User u2 = users[i];
                    //zamiana miescami w komorkach tablicy
                    users[i - 1] = u2;
                    users[i] = u1;
                }
            }
        }
    }
}