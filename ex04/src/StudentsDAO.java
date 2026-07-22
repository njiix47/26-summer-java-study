import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentsDAO {

    String HOST = "svc.sel3.cloudtype.app";
    String PORT = "32701";
    String DB_NAME = "dgsw";
    String USER = "root";
    String PASSWORD = "1234";

    String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DB_NAME
            + "?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=Asia/Seoul";

    public void insert() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        String insertSQL = "INSERT INTO students (name,age,email) VALUES (?,?,?)";


        try {
            // DB 연결
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            pstmt = conn.prepareStatement(insertSQL);

            System.out.println("name을 입력하세요");
            String name = IO.readln();

            System.out.println("email을 입력하세요");
            String email = IO.readln();

            pstmt.setString(1, name);
            pstmt.setInt(2, 20);
            pstmt.setString(3, email);

            pstmt.executeUpdate();
            System.out.println("저장성공");


        } catch (Exception e) {
            e.printStackTrace(); // 오류 메시지 출력
            // conn.close();
        }
    }

    public void select() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        String selectSQL = "SELECT * FROM students";
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            pstmt = conn.prepareStatement(selectSQL);

            rs = pstmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");

                String name = rs.getString("name");
                int age = rs.getInt("age");
                String email = rs.getString("email");
                String created_at = rs.getString("created_at");

                System.out.print(id + "\t");
                System.out.print(name + " / ");
                System.out.print(age + " / ");
                System.out.print(email + " / ");
                System.out.print(created_at + " / ");
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        String deleteSQL = "DELETE FROM students";

        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD); // DB 연결
            pstmt = conn.prepareStatement(deleteSQL); // SQL 구문 설정
            pstmt.executeUpdate(); // SQL 구문 실행

            System.out.println("전체 삭제 되었습니다.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        String updateSQL = "UPDATE students SET name=? WHERE email=?";

        System.out.println("이름을 입력하세요.");
        String name = IO.readln();

        System.out.println("변경할 행의 email을 입력하세요.");
        String email = IO.readln();


        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            pstmt = conn.prepareStatement(updateSQL);

            pstmt.setString(1, name);
            pstmt.setString(2, email);

            pstmt.executeUpdate();
            System.out.println("수정이 완료되었습니다.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
