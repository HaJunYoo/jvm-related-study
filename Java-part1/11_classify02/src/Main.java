import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("점수: ");
        int score = s.nextInt();
        char ch = 'A';

        if(score >= 80) {
            if(score >= 90)
                ch = 'A';
            else
                ch = 'B';
        }
        else {
            if (score >= 70)
                ch = 'C';
            else {
                ch = 'D';
                if (score < 60)
                    ch = 'F';
            }
        }

        System.out.println("점수: " + score + " 학점: " + ch);
    }
}