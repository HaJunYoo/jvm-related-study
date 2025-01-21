public class Main {
    public static void main(String[] args) {
        int[] aSrc = {10, 20 , 30, 40, 50};
        int[] aDst = aSrc;

        aDst[2] = 100;
        for(int data : aSrc)
            System.out.print(data + "\t");
    }
}