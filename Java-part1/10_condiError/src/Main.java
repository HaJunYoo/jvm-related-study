import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();

        int result = 0, result2;
        result2 = (input <= 10) ? (result = 10) : (result = 20);
        System.out.println("result: " + result);
    }
}