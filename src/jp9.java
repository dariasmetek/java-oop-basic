public class jp9 {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 6, 2, 7, 8, 1, 9, 2};
        int sum = 0;
        for (int element : numbers){
            sum = sum + element;
        }
        System.out.println(((double)sum)/numbers.length);
    }
}
