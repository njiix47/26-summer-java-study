public class Ex01 {
    static void main(String[] args) {

        String a = "java"; // 리터럴 할당
        String b = "java"; // a와 같은 주소를 가리킴
        String c = new String("java"); // 새로운 메모리 주소에 생성

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        System.out.println();

        System.out.println("a == b " + (a == b));
        System.out.println("a == c " + (a == c));

        System.out.println("a.equals(c) " + a.equals(c));
    }
}
