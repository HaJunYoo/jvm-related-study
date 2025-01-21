public class Main {
    public static void main(String[] args) {
        int data = 0x11223344;
        System.out.printf("%08X\n", data & 0xFF000000);
        System.out.printf("%08X\n", data & 0x00FF0000);
        System.out.printf("%08X\n", data & 0x0000FF00);
        System.out.printf("%08X\n", data & 0x000000FF);
    }
}