public class ex01 {

    public void doA() {

        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i + "*" + j + "=" + j * i + " ");
            }
            System.out.println();
        }

    }
    public void doB() {
        int num = 10;
        switch (num) {
            case 10 :
                System.out.println("10입니다");
                break;
            default :
                System.out.println("기본");
        }
    }


}
