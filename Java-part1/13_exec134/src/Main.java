import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] array = {
                {10, 20, 30, 0},
                {40, 50, 60, 0},
                {0, 0, 0, 0}
        };

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                array[2][i] += array[j][i];
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][3] += array[i][j];
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {

            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}