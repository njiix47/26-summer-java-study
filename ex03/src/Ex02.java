public class Ex02 {
    public static void main(String[] args) {
        int num = 1;
        while (num < 11) {
            if (num == 5) {
                num ++;
                continue;
            };
            if (num > 8) {
                break;
            }

            System.out.print(num + " ");
            num ++;
        }
    }
}
