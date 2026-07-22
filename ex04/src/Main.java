//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    String a = "abc";
    String b = a;

    String c = new String("abcdef");
    String d = new String("abcdef");

    System.out.println("a == b " + (a == b));
    System.out.println("c == d " + (c == d)); // 아예 같은 값(동일 주소) 인지 검사!!
    System.out.println("c.equals(d) " + (c.equals(d))); // 내용만 검사!!

}
