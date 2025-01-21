import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = 0;
        do {
            input = s.nextInt();
            System.out.println("Input:" + input);
        } while(input != 0);
    }
}