import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MySqlTest {
    static void main(String[] args) {
        String selectSQL = "SELECT * FROM students";

        while (true) {
            System.out.println("뭐할건데 \n 1. insert \n 2. select \n 3. delete \n 4. update \n 5. exit");
            String choose = IO.readln();

            if (choose.equals("1")) {
                StudentsDAO dao = new StudentsDAO();
                dao.insert();

            } else if (choose.equals("2")) {
                StudentsDAO dao = new StudentsDAO();
                dao.select();

            } else if (choose.equals("3")) {
                StudentsDAO dao = new StudentsDAO();
                dao.delete();

            } else if (choose.equals("4")) {
                StudentsDAO dao = new StudentsDAO();
                dao.update();

            } else if (choose.equals("5")) {
                break;

            }
        }
    }
}
