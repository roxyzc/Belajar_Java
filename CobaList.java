import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class CobaList {
    public static void main(String[] args) {
        List<Integer> coba12 = new ArrayList<Integer>();
        coba12.add(1);
        coba12.add(9);
        coba12.add(2);
        Collections.sort(coba12);
        for (var i : coba12) {
            System.out.println(i);
        }
    }

}
