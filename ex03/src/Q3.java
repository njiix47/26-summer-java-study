public class Q3 {
    public static void main(String[] args) {
        solution(10);
    }

    public static int solution(int n) {
        int answer = 0;
        for (int i = 0; i <= n; i += 2) {
            answer += i;
        }
        System.out.println(answer);
        return answer;
    }

}