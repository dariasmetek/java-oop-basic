package start;

public class MultiTab {
    public static void main(String[] args) {

        char kik2 [][] = {{'_', '_', '_'}, {'_', '_', '_'}, {'_', '_', '_'}};

        System.out.printf("%c %c %c\n", kik2[0][0], kik2[0][1], kik2[0][2]);
        System.out.printf("%c %c %c\n", kik2[1][0], kik2[1][1], kik2[1][2]);
        System.out.printf("%c %c %c\n", kik2[2][0], kik2[2][1], kik2[2][2]);

        kik2[1][2] = 'X';
        System.out.println();
        System.out.printf("%c %c %c\n", kik2[0][0], kik2[0][1], kik2[0][2]);
        System.out.printf("%c %c %c\n", kik2[1][0], kik2[1][1], kik2[1][2]);
        System.out.printf("%c %c %c\n", kik2[2][0], kik2[2][1], kik2[2][2]);

        kik2[2][0] = '0';
        System.out.println();
        System.out.printf("%c %c %c\n", kik2[0][0], kik2[0][1], kik2[0][2]);
        System.out.printf("%c %c %c\n", kik2[1][0], kik2[1][1], kik2[1][2]);
        System.out.printf("%c %c %c\n", kik2[2][0], kik2[2][1], kik2[2][2]);

    }
}
