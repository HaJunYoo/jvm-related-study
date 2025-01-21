public class Main {
    public static void main(String[] args) {
        int x = 0, result = 0;
        System.out.println(++x);
        System.out.println(x++);
        result = x++;
        System.out.printf("%d, %d\n", result, x);
    }
}