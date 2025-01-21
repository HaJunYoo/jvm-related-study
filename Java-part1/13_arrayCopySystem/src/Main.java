public class Main {
    public static void main(String[] args) {
        int[] aSrc = {10, 20 , 30, 40, 50};
        int[] aDst = new int[aSrc.length];

        System.arraycopy(aSrc, 0, aDst, 0, aDst.length);

        aSrc[2] = 100;
        System.out.print("aSrc[]: ");
        for(int data : aSrc)
            System.out.print(data + "\t");

        System.out.print("\naDst[]: ");
        for(int data : aDst)
            System.out.print(data + "\t");
    }
}