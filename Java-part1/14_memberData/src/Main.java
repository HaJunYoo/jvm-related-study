public class Main {
    static int testData = 10;

    public static void main(String[] args) {
        System.out.println("main() - begin: " + testData);
        Main.testFunc();
        System.out.println("main() - end: " + testData);
    }

    public static void testFunc() {
        int testData = 100;
        Main.testData = 300;
        System.out.println("testFunc() : " + testData);
    }
}