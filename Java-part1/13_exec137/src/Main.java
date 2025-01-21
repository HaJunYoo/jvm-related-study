import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[5][5];

        int x = -1, y = 0, cnt = 0;
        int length = 0, direction = 1;

        for (length = 9; length > 0; length -= 2) {
            for (int i = 0; i < length; i++) {
                if(i < length / 2 + 1)
                    x += direction;
                else
                    y += direction;

                array[y][x] = ++cnt;
            }

            direction = -direction;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%d\t", array[i][j]);
            }
            System.out.print('\n');
        }
    }
}