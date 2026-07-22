import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlTest {
    static void main(String[] args) {
        String HOST = "svc.sel3.cloudtype.app";
        String PORT = "32701";
        String DB_NAME = "dgsw";
        String USER = "root";
        String PASSWORD = "1234";

        String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DB_NAME
                + "?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=Asia/Seoul";

        Connection conn = null;

        try {
            // DB 연결
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("연결성공");
        } catch (Exception e) {
            e.printStackTrace(); // 오류 메시지 출력
            // conn.close();
        }
    }
}
