import java.util.Arrays;

public class Ex06 {
    static void doA(int num) {
        System.out.println(num);
        num = 100;
    }

    static void doB(int arr[]) {
        System.out.println(Arrays.toString(arr));
        arr[0] = 200;
    }

    static void main() {
        int a = 10;
        doA(a);

        int b[] = {10, 20, 30,};
        doB(b);

        System.out.println("a = " + a);
        System.out.println("b = " + Arrays.toString(b));
    }
}
