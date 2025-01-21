import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("점수: ");
        int score = s.nextInt();
        char ch = 'A';

        if(score >= 90)
            ch = 'A';
        else if (score >= 80)
            ch = 'B';
        else if (score >= 70)
            ch = 'C';
        else if (score >= 60)
            ch = 'D';
        else
            ch = 'F';

        System.out.println("점수: " + score + " 학점: " + ch);
    }
}