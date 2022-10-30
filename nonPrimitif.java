public class nonPrimitif {
    public static void main(String[] args) {
        // Integer iniInteger = 100;
        // Long iniLong = 1000L;
        // Byte iniByte = null;

        int iniInt = 100;
        Integer iniInteger2 = iniInt;
        short iniShort = iniInteger2.shortValue();
        byte iniByte2 = iniInteger2.byteValue();
        System.out.println(iniByte2 + " " + iniShort);
    }
}
