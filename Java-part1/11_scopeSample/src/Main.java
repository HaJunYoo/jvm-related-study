import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("나이를 입력하세요: ");
        int age = s.nextInt();

        if(age >= 20) {
            int ageFinal = age;
            System.out.printf("처리전, 당신의 나이는 %d세 입니다.\n", ageFinal);
            age = 20;
        }

        System.out.println("최종 당신의 나이는 " + ageFinal + "세 입니다.");
        System.out.println("최종 당신의 나이는 " + age + "세 입니다.");
    }
}