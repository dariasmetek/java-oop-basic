package start;

public class Variables {
    public static void main(String[] args) {
        //deklaracja i inicjalizacja
        int x = 0;
        System.out.println(x);
        //deklaracja
        int y;
        //modyfikacja
        y = x + 11;
        System.out.println(y= x + 11);
        //napisy
        System.out.println("KLASA STRING");
        String word = "Lorem ipsum Lorem ipsum";
        //szukanie po indeksie
        System.out.println(word.charAt(8));
        //szukanie po wartosci
        System.out.println(word.indexOf("s"));
        //porównanie
        String word2 = "Header";
        System.out.println(word.equals(word2));
        System.out.println(word2.equals("header"));
        System.out.println(word2.equals("Header"));
        System.out.println(word2.equals(word));
        //wydobywanie podciagu
        System.out.println(word.contains("ipsum"));
        System.out.println(word.substring(6,11));
        System.out.println(word.substring(6,11).length());
        int myStringLen = word.substring(6,11).length();
        System.out.println("myStringLen = " + myStringLen);
        //dzielenie
        String words [] = word.split( " ");
        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
        System.out.println(words[3]);





    }
}
