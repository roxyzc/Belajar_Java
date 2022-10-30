public class KonversiNumber {
    public static void main(String[] args) {
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

        int iniInt2 = 999;
        short inishort2 = (short) iniInt2;
        byte iniByte2 = (byte) inishort2;
        System.out.println(iniInt + " " + iniByte2);
    }
}
