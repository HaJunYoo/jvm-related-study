import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        int tmp = a;
        a = b;
        b = tmp;
        System.out.printf("a: %d, b: %d\n", a, b);
    }
}