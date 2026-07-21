import java.util.Arrays;

public class Ex04 {
    void main(String[] args) {

        int arr[][] = new int[3][2];
        doPrint(arr);

    }

    public static void doPrint(int brr[][]) {
        System.out.println("doPrint");
        for (int i = 0; i < brr.length; i++) {
            System.out.println(Arrays.toString(brr[i]));
        }
    }
}
