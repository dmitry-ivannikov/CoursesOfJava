import javax.xml.transform.Result;
import java.sql.*;

public class JDBC12ScrollableRowSet {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String userName = "root";
        String password = "123qwe";
        String connectionUrl = "jdbc:mysql://localhost:3306/Lessons";
        Class.forName("com.mysql.jdbc.Driver");
        try(Connection conn = DriverManager.getConnection(connectionUrl, userName, password);
            Statement statement = conn.createStatement()){
            statement.executeUpdate("drop table if exists Books");
            statement.executeUpdate("create table if not exists Books (id mediumint not null auto_increment, name char(30) not null, primary key (id));");
            statement.executeUpdate("insert into Books (name) values ('Inferno')");
            statement.executeUpdate("insert into Books (name) values ('Davinchi')");
            statement.executeUpdate("insert into Books (name) values ('Solomin')");

            Statement statement1 = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            //PreparedStatement preparedStatement = conn.prepareStatement("", ResultSet.TYPE_SCROLL_INSENSITIVE , ResultSet.CONCUR_READ_ONLY);
            ResultSet resultSet = statement1.executeQuery("select * from Books");
            if (resultSet.next()){
                System.out.println(resultSet.getString("name"));
            }
            if  (resultSet.next()){
                System.out.println(resultSet.getString("name"));
            }
            if (resultSet.previous()){
                System.out.println(resultSet.getString("name"));
            }
            if (resultSet.relative(2)){
                System.out.println(resultSet.getString("name"));
            }
            if (resultSet.relative(-2)){//absolure, first , last, resultSet.beforeFirst(last) --> for (for while)
                System.out.println(resultSet.getString("name"));
            }
        }
    }
}
