public class ex02 {

    static void main(String[] args) {
        String input = IO.readln(); // input 받기
        System.out.println("input = " + input);

        Test test = new Test();
        test.doA();

        System.out.println("main 종료");
    }
}
