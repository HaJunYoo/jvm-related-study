import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();

        //10_condiSample
        //int result = input <= 10 ? 10 : 20;
        int result = 0;
        if(input <= 10)
            result = 10;
        else
            result = 20;
        System.out.println("result: " + result);
    }
}