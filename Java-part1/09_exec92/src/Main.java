import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();

        int hour = input / 3600;
        int min = (input % 3600) / 60;
        int sec = input % 60;

        System.out.printf("%d초는 %d시간 %d분 %d초 입니다.\n",
                input, hour, min, sec);
    }
}