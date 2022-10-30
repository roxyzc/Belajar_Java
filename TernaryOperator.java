public class TernaryOperator {
    public static void main(String[] args) {
        var nilai = 10;
        var ucapan = nilai >= 10 ? "Halo" : "oke";
        System.out.println(ucapan);
        sayHello("roxyzc");
    }

    static void sayHello(String name) {
        String hello = "Hello " + name;
        if (!name.isBlank()) {
            System.out.println("Hi " + name);
        }
        System.out.println(hello);
    }
}
