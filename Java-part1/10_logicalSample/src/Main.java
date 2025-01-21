import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();

        boolean result = input < 5 || input > 10;
        System.out.println("Result: " + result);
    }
}