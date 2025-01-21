import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        printChar(input, input.length() - 1);
    }

    public static void printChar(String param, int idx) {
        if(idx < 0)
            return;

        System.out.print(param.charAt(idx));
        printChar(param, idx - 1);
    }
}