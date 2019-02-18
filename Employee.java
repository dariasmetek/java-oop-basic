package model;

public class Employee {
    public String name;
    public String lastname;
    public String PESEL;
    public String birth_date;
    public String emp_date;
    public double salary_net;


    public Employee(String name, String lastname, String PESEL, String birth_date, String emp_date, double salary_net) {
        this.name = name;
        this.lastname = lastname;
        this.PESEL = PESEL;
        this.birth_date = birth_date;
        this.emp_date = emp_date;
        this.salary_net = salary_net;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", PESEL='" + PESEL + '\'' +
                ", birth_date='" + birth_date + '\'' +
                ", emp_date='" + emp_date + '\'' +
                ", salary_net=" + salary_net +
                '}';
    }
}
