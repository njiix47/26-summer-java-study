import java.util.Arrays;

public class Ex05 {

    static void main(String[] args) {

        int arr[] = new int[10];
        int brr[] = arr;

        arr[0] = 100;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(brr));

    }

}
