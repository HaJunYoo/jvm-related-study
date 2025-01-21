public class Main {
    public static void main(String[] args) {
        int[] aSrc = {10, 20 , 30, 40, 50};

        int[] aDst01 = new int[aSrc.length];
        for (int i = 0; i < aSrc.length; i++) {
            aDst01[i] = aSrc[i];
        }

        aDst01[2] = 100;

        System.out.print("  aSrc[]: ");
        for(int data : aSrc)
            System.out.print(data + "\t");

        System.out.print("\naDst01[]: ");
        for(int data : aDst01)
            System.out.print(data + "\t");


        int[] aDst02 = aSrc.clone();
        aDst02[3] = 300;
        System.out.print("\n  aSrc[]: ");
        for(int data : aSrc)
            System.out.print(data + "\t");

        System.out.print("\naDst02[]: ");
        for(int data : aDst02)
            System.out.print(data + "\t");
    }
}