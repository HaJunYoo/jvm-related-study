import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int limit = 160;
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        if(input >= limit)
            System.out.println("160 이상");
        else
            System.out.println("160 미만");
    }
}