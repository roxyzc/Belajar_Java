class Parent {
    String nama;

    public void panggil() {
        System.out.println("halo parent");
    }
}

final class Child extends Parent {
    String nama;

    public void panggil() {
        System.out.println("halo Child");
    }
}

// error
// class Coba extends Facebook{

// }

public class FinalClass {
    public static void main(String[] args) {
        Child child = new Child();
        child.nama = "roxyzc";

        child.panggil();
        System.out.println(child.nama);

        Parent parent = (Parent) child;
        parent.panggil();
        System.out.println(parent.nama);

        Parent parent1 = new Parent() {
            public void panggil() {
                System.out.println("Panggil saya: " + this.nama);
            }
        };
        parent1.panggil();

    }

    static void cobaPanggil(Parent parent) {
        parent.panggil();
    }

}
