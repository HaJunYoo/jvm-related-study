public class Main {
    public static void main(String[] args) {
        int[] array = {50, 40, 10, 30, 20};
        int tmp = 0, idxMin = 0;
        for(int i = 0; i < array.length - 1; ++i) {
            idxMin = i;
            for(int j = i + 1; j < array.length; ++j) {
                if(array[idxMin] > array[j])
                    idxMin = j;
            }

            if(idxMin != i) {
                tmp = array[i];
                array[i] = array[idxMin];
                array[idxMin] = tmp;
            }
        }

        for(int data : array)
            System.out.printf("%d\t", data);
        System.out.print('\n');
    }
}