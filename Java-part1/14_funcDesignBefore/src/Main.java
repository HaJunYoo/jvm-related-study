import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("factorial: "+
                getFactorial(s.nextInt()));
    }

    public static int getFactorial(int param) {
        if(param < 1 || param > 10) {
            System.out.println("ERROR: 1~10 사이 정수를 입력하세요.");
            return 0;
        }

        int result = 1;
        for (int i = 1; i <= param; i++)
            result *= i;
        return result;
    }
}