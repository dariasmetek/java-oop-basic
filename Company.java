package controller;
import model.Employee;

public class Company {
    Employee employees[] = new Employee[10];
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
                salary_net);

        //inkrementacja index-u
        index++;
        //zapisanie pracownika do listy pracownikow
        employees[index] = e;
        //wyswietlenie danych zapisanego pracownika
        System.out.println("Dodano pracownika: " + e);
    }

    public void getAllEmployees() {
        System.out.println("Lista pracownikow");
        for (int i = 0; i < index; i++) {
            System.out.println(employees[i]);
        }
    }
    public Employee getEmployeebyPESEL(String PESEL_search){
        for (int i = 0; i < index; i++){
            if (employees[i].PESEL.equals(PESEL_search)){
                return employees[i];
            }
        }
        return null;
    }
    public void setSalary(String PESEL_search, double newSalary){
        for (int i = 0; i < index; i++) {
            if (employees[i].PESEL.equals(PESEL_search)){
                employees[i].salary_net = newSalary;
            }
        }
    }




    public static void main(String[] args) {
        Company c = new Company();
        //wywolania metod
        c.addEmployee("M", "K", "1233221123", "2000-02-02", "2019-01-01", 10000);
        c.addEmployee("A", "A", "5553221123", "2001-02-02", "2018-02-01", 12000);
        c.getAllEmployees();
        System.out.println("Wyszukano: " + c.getEmployeebyPESEL("333"));
        System.out.println("Wyszukano: " + c.getEmployeebyPESEL("5553221123"));
        c.setSalary("1233221123", 20000);
        c.getAllEmployees();
    }

}
