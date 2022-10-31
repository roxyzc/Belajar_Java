import java.io.IOException;

public class ErrorHandler {
    public static void coba(int x) {
        try {
            if (x <= 0) {
                throw new IOException();
            }
            System.out.println(x);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        ErrorHandler.coba(0);
    }
}
