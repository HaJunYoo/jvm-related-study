import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("세 정수를 입력하세요: ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        System.out.println("MAX: " + getMax(a, b, c));
    }

    public static int getMax(int a, int b, int c) {
        int max = a;
        if(b > max)     max = b;
        if(c > max)     max = c;

        return max;
    }
}