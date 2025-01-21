import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("나이: ");
        int age = s.nextInt();
        System.out.print("키: ");
        int height = s.nextInt();

        System.out.printf("결과: %b\n",
                age >= 20 && age <= 30 && height >= 150 ||
                age >= 100 ||
                height >= 200);
    }
}