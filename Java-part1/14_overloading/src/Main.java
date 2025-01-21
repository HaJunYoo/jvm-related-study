public class Main {
    public static void main(String[] args) {
        System.out.println(add(3, 4));
        System.out.println(add(3.3, 4.4));
        System.out.println(add("Hello", "World"));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static String add(String a, String b) {
        return a + b;
    }
}