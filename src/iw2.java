import java.util.Scanner;
public class iw2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int empl_fell = scanner.nextInt();
        if(empl_fell >=0 && empl_fell < 5) {
            System.out.println("junior");
        }else if (empl_fell >=5 && empl_fell < 10) {
            System.out.println("regular");
        }else{
            System.out.println("senior");
        }
        //--------------------
        switch (empl_fell){
            case 0: case 1: case 2: case 3: case 4:
                System.out.println("junior");
                break;
            case 5: case 6: case 7: case 8: case 9:
                System.out.println("regular");
                break;
            default:
                System.out.println("senior");

        }
        scanner.close();
    }
}
