import java.util.Scanner;

class Converter {
    public static String toBinary(int x) {
        String binary = "";
        while (x > 0) {
            binary = (x % 2) + binary;
            x /= 2;
        }
        return binary;
    }
}

public class Convert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println(Converter.toBinary(x));
        input.close();
    }
}
