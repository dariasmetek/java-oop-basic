public class jp7 {
    public static void main(String[] args) {
       String name = "Marek";
       name = name.toUpperCase();

        System.out.println("Kim jestes");
        System.out.println(name.toUpperCase().charAt(name.length()-1) == 'A' &&
                !name.equals("KUBA") &&
                !name.equals("BARNABA")
                ? "kobieta" : "mezczyzna");
    }
}
