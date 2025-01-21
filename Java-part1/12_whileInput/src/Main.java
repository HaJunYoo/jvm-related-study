import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int input = 0;
        while((input = System.in.read()) != 'q') {
            System.out.println("input: " + input);
        }
        System.out.print("Exit");
    }
}