public class Q1 {
    
    public int q1(int[] numbers) {
        int max1 = 0;
        int max2 = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (max1 < numbers[i]) {
                max2 = max1;
                max1 = numbers[i];
            }
        }

        System.out.println("max1 = " + max1) ;
        System.out.println("max2 = " + max2) ;
        int answer = max1 * max2;
        return answer;
    }
}
