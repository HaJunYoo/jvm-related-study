import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double[] rateArray = {
                0.0, 0.1, 0.25,
                0.5, 0.5,
                0.6, 0.65,
                0.8, 0.82, 0.97
        };

        final int fee = 1000;
        System.out.println("요금표");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d세 요금: \t%d원\n",
                    i, (int)(fee * rateArray[i - 1]));
        }

        System.out.print("나이를 입력하세요: ");
        int age = s.nextInt();
        if(age < 1)
            age = 1;
        else if(age > 10)
            age = 10;

        System.out.printf("요금: %d원\n",
                (int)(fee * rateArray[age - 1]));
    }
}