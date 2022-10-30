import static roxyzc.Coba.*;

class Application {
    public static final int PROCESSOR;
    static {
        System.out.println("Mengakses class application");
        PROCESSOR = Runtime.getRuntime().availableProcessors();
    }
}

class Constant {
    public static final String APPLICATION = "Belajar Java";
}

class MathUtil {
    public static int sum(int... values) {
        int total = 0;
        for (var value : values) {
            total += value;
        }
        return total;
    }
}

class Country {
    private String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public static class City {
        private String nama;

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }
    }
}

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(AGE);
        System.out.println(Constant.APPLICATION);
        System.out.println(MathUtil.sum(1, 2, 4, 5, 6, 6));
        Country.City city = new Country.City();
        city.setNama("Jakarta");
        System.out.println(city.getNama());
        System.out.println(Application.PROCESSOR);
    }
}
