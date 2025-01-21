import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("점수를 입력하세요: ");
        int score = s.nextInt();

        String result;
        result = (score >= 80) ? "합격" : "불합격";
        System.out.println("결과: " + result);
    }
}