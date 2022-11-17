package belajar;

// shadow variabel
class Parent {
    public String nama;

    public void panggil() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    // // field
    // public String nama;

    // // method
    public void panggil() {
        System.out.println("Child");
    }
}

public class coba {
    // static = cuma bisa akses di dalam kurung kurawal

    final public static float PHI = 3.14f;

    static {
        System.out.println("Pake static");
    }

    // final = tidak bisa diubah
    // constant
    final public String nama = "roxyzc";

    // metode final
    final public void cetak() {
        System.out.println("Final");
    }

    public static void main(String[] args) {
        // coba c = new coba()
        // {
        // @Override
        // public void cetak() {
        // System.out.println("coba");
        // }
        // };
        // System.out.println(coba.PHI);

        // Child child = new Child();
        // child.panggil();
        // child.nama = "roxyzc";
        // System.out.println(child.nama);

        // Parent parent = (Parent) child;
        // parent.panggil();
        // System.out.println(parent.nama);

        // byte -> short -> int -> long
        // var nilai = 11;
        // ternary
        // var hasil = (nilai > 10) ? "nilai lebih dari 10" : "nilai kurang dari 10";

        // var hasil1 = switch (nilai) {
        // case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 -> "nilainya kurang dari sama dengan 10";
        // case 11, 12, 13 -> "nilainya lebih dari 10";
        // default -> "nilai tidak ditemukan";
        // };
        // System.out.println(hasil1);

        // switch (nilai) {
        // case 11, 12, 13:
        // System.out.println("coba");
        // System.out.println("coba");
        // System.out.println("coba");
        // break;
        // default:
        // break;
        // }

        // Parent p = new Parent();
        // Child c = new Child();

        // System.out.println(!(c instanceof Parent));

        System.out.println(coba.PHI);

    }
}
