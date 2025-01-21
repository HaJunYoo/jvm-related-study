import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        int result = 0;
        if(input <= 10) {
            if(input < 0)
                result = 0;
            else
                result = 10;
        }
        else
            result = 20;

        System.out.println("result: " + result);
    }
}