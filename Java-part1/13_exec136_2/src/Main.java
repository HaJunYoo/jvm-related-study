import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[5][5];

        int cnt = 0;
        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            if(flag) {
                for (int j = 0; j < array[i].length; j++)
                    array[i][j] = ++cnt;
            }
            else {
                for (int j = 0; j < array[i].length; j++)
                    array[i][4 - j] = ++cnt;
            }

            flag = !flag;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%d\t", array[i][j]);
            }
            System.out.print('\n');
        }
    }
}