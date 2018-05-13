import javafx.scene.Scene;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTemplate {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String userName = "root";
        String password = "123qwe";
        String connectionUrl = "jdbc:mysql://localhost:3306/Lessons";
        Class.forName("com.mysql.jdbc.Driver");
        try(Connection conn = DriverManager.getConnection(connectionUrl, userName, password);
            Statement statement = conn.createStatement()){
            statement.executeUpdate("drop table Books");
            statement.executeUpdate("create table if not exists Books (id mediumint not null auto_increment, name char(30) not null, img BLOB, primary key (id));");

        }
    }
}
