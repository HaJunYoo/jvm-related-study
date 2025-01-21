import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();

        int result = input <= 10 ? 10 : 20;
        System.out.println("result: " + result);
    }
}