import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {
        // Python에서는 리스트의 길이가 무한대로 늘어나는데 비해 Java에서는 처음 정한 배열의 크기를 변경할 수 없다.
        int arr[] = new int[5];

        arr[0] = 10;
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < 5; i++) {
            System.out.println("arr[i] = " + arr[i]);
        }
    }
}
