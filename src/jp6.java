import java.util.Random;

public class jp6 {
    public static void main(String[] args) {
        //losowanie od 1 do 10
        //obiekt do losowania
        Random rnd = new Random();
        int var1 = rnd.nextInt(10) + 1;
        System.out.println("var1 = " + var1);
        int var2 = rnd.nextInt(10) + 1;
        System.out.println("var2 = " + var2);

        System.out.println(var1 > var2);
        System.out.println(var1*2 > var2);
        System.out.println(var1*2 > var2 + 3 && var2 > var1 -2);
        System.out.println((var1 * var2) %2 == 0);

    }
}
