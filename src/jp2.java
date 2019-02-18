public class jp2 {
    public static void main(String[] args) {
        //deklaracje
        String name, lastname, position;
        final String PESEL;
        char gender;
        double salary_net;
        boolean isRetired;
        //przypisanie
        name = "Adam";
        lastname = "Kowalski";
        position = "Developer";
        PESEL = "1234556654";
        gender = 'M';
        salary_net = 10000;
        isRetired = false;
        //prezentacja
        System.out.printf("%10s| %10s|%12s|%2s | %2s |%8.2fzl|%b", name, lastname, position, PESEL, gender, salary_net, isRetired);
        System.out.println(name + " " + lastname + " ");

    }
}
