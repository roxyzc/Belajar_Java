import java.io.IOException;

class Loader implements Runnable {
    public void run() {
        System.out.println("Mantap bang");
    }
}

public class CobaThread {
    public static void main(String[] args) {
        Thread load = new Thread(new Loader());
        load.start();
        try {
            int x = 0;
            Thread.sleep(10000);
            if (x == 0) {
                throw new IOException();
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
