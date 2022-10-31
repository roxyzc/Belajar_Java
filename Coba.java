import java.util.Scanner;

public class Coba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int y = 200000;
        for (int i = 1; i <= amount; i++) {
            // if(i == 1){
            int payment = y * 10 / 100;
            y -= payment;
            System.out.println(y);
            // }else if(i == 2){
            // y = y * 10 / 100;
            // System.out.println(y);
            // }else{

            // }
        }
        scanner.close();
    }
}
