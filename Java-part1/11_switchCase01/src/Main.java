import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int left = s.nextInt();
        char operator = s.next().charAt(0);
        int right = s.nextInt();
        int result = 0;

        switch (operator)
        {
            case '+':
                result = left + right;
                break;

            case '-':
                result = left - right;
                break;

            case '*':
                result = left * right;
                break;

            case '/':
                result = left / right;
                break;
        }

        System.out.println("result: " + result);
    }
}