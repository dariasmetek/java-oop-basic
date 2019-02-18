package controller;
import model.Employee;

public class Company {
    Employee employees [] = new Employee[10];
    int index = 0;

    public void addEmployee(String name,
                            String lastname,
                            String PESEL,
                            String birth_date,
                            String emp_date,
                            double salary_net) {
        //utworzenie obiektu pracownika
         Employee e = new Employee(name,
                 lastname,
                 PESEL,
                 birth_date,
                 emp_date,
                 salary_net );

        //zapisanie pracownika do listy pracownikow
          employees[index] = e;
        //wyswietlenie danych zapisanego pracownika
        System.out.println("Dodano pracownika: " + e);
    }

    public static void main(String[] args) {
        Company c = new Company();
        c.addEmployee("M", "K", "1233221123", "2000-02-02", "2019-01-01", 10000);
        c.addEmployee("A", "A", "5553221123", "2001-02-02", "2018-02-01", 12000);
    }
}
