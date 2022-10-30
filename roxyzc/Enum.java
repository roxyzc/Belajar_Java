package roxyzc;

enum role {
    ADMIN("Admin"),
    MEMBER("Member");

    private String desk;

    role(String desk) {
        this.desk = desk;
    }

    public String getDesk() {
        return desk;
    }
}

public class Enum {
    public static void main(String[] args) {
        System.out.println(role.ADMIN.getDesk());
    }
}