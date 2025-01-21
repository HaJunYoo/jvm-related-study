import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        char ch = (char)System.in.read();
        Scanner s = new Scanner(System.in);
        String data = s.nextLine();

        System.out.println("ch: " + ch);
        System.out.println("data: " + data);
    }
}