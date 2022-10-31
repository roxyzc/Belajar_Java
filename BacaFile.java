import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class BacaFile {
    public static void main(String[] args) {
        try {
            File x = new File("text.txt");
            if (x.exists()) {
                Scanner scanner = new Scanner(x);
                String hasil = " ";
                while (scanner.hasNext()) {
                    hasil = scanner.next() + " " + hasil;
                }
                System.out.println(hasil);
                scanner.close();
            } else {
                throw new FileNotFoundException();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
