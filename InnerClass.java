class Kucing {
    private String nama1;

    public Kucing(String nama) {
        this.nama1 = nama;
    }

    public String getNama() {
        return nama1;
    }

    class Tikus {
        private String nama2;

        public Tikus(String nama) {
            this.nama2 = nama;
        }

        public String getNama() {
            return nama2;
        }

        public void makan() {
            System.out.println(nama1.toLowerCase() != nama2.toLowerCase());
            var hasil = nama1.toLowerCase() != nama2.toLowerCase() ? "GG namanya sama"
                    : nama1 + " diburu " + this.getNama();
            System.out.println(hasil);
        }
    }

    public void makan() {
        Tikus tikus = new Tikus("Arya");
        tikus.makan();
    }
}

class CetakNama {
    static {
        System.out.println("Cetak Nama");
    }

    final public static void CETAK() {
        System.out.println("Nama\t: Ridho Pikriyansyah");
        System.out.println("Kelas\t: TI.21.A.3");
        System.out.println("Nim\t: 312110169");
        System.out.println("");
    }
}

public class InnerClass {
    public static void main(String[] args) {
        CetakNama.CETAK();
        Kucing kucing = new Kucing("Arya");
        kucing.makan();

        for (int i = 2; i < 10; i = i * i) {
            System.out.println(i);
        }
    }
}
