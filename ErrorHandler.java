import java.io.IOException;

interface IErrorHandler {
    public void myFunc(int i);
}

public class ErrorHandler implements IErrorHandler {
    public void myFunc(int i) throws ArithmeticException {
        if (i == 0) {
            throw new ArithmeticException();
        }
        System.out.println(i);
    }

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
        ErrorHandler error = new ErrorHandler();
        ErrorHandler.coba(0);
        error.myFunc(1);
    }
}
