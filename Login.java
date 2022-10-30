record RequestLogin(String nama, String password) {
    public RequestLogin {
        System.out.println("Login");
    }

    public RequestLogin(String nama) {
        this(nama, null);
    }

    public String getNama() {
        return nama;
    }

    public boolean cekPassword() {
        if (password != null) {
            return false;
        } else {
            return true;
        }
    }

}

public class Login {
    public static void main(String[] args) {
        RequestLogin req = new RequestLogin("roxyzc");
        System.out.println(req.nama());
        System.out.println(req.password());
    }
}
