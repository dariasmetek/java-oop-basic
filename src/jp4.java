public class jp4 {
    public static void main(String[] args) {
        String sentence = "ALA MA KOTA A KOT MA ALE";
        String words [] = sentence.split(" ");
        System.out.println(words[0] );
        System.out.println(words[1] );
        System.out.println(words[2] );
        System.out.println(words[3] );
        System.out.println(words[4] );
        System.out.println(words[5] );
        System.out.println(words[6] );
    for (String word : words) {
        System.out.println(word);
    }
    }
}
