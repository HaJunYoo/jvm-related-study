import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int total = 0;
        int input = s.nextInt();
        total += input;
        input = s.nextInt();
        total += input;
        input = s.nextInt();
        total += input;
        System.out.println("Total: " + total);
    }
}