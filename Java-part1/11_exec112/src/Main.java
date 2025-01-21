import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int age = s.nextInt();
        int fee = 750;

        if(age >= 20) {
            age = 20;
            fee = 100;
        }

        System.out.println("나이:" + age + ", 최종요금: " + fee);
    }
}