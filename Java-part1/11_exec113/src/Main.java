import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int age = s.nextInt();
        double rate = 0.0;

        if(age < 14) {
            if(age < 4)
                rate = 0.0;
            else
                rate = 0.5;
        }
        else {
            if(age >= 20)
                rate = 1.0;
            else
                rate = 0.75;
        }

        double fee = 1000 * rate;
        System.out.printf("나이: %d, 최종요금: %d", age, (int)fee);
    }
}