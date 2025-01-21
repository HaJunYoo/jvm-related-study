public class Main {
    public static void main(String[] args) throws Exception{
        String ga = "가";
        System.out.println((int)'가');
        System.out.printf("%04X\n", (int)'가');
        byte[] codeData = ga.getBytes();
        System.out.printf("%02X %02X %02X\n",
                codeData[0], codeData[1], codeData[2]);
    }
}