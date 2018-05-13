import javax.xml.transform.Result;
import java.sql.*;

public class JDBC13UpdateResultSet {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String userName = "root";
        String password = "123qwe";
        String connectionUrl = "jdbc:mysql://localhost:3306/Lessons";
        Class.forName("com.mysql.jdbc.Driver");
        try(Connection conn = DriverManager.getConnection(connectionUrl, userName, password);
            Statement statement = conn.createStatement()){
            statement.executeUpdate("drop table Books");
            statement.executeUpdate("create table if not exists Books (id mediumint not null auto_increment, name char(30) not null, primary key (id));");
            statement.executeUpdate("insert into Books (name) values ('Inferno')");
            statement.executeUpdate("insert into Books (name) values ('Davinchi')");
            statement.executeUpdate("insert into Books (name) values ('Solomin')");

            Statement statement1 = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet resultSet = statement1.executeQuery("select * from Books");
            while (resultSet.next()){
                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getString("name"));
            }

            resultSet.last();
            resultSet.updateString("name", "new Value");
            resultSet.updateRow();

            resultSet.moveToInsertRow();
            resultSet.updateString("name", " inserted raw");
            resultSet.insertRow();


            resultSet.absolute(2);
            resultSet.deleteRow();

            resultSet.beforeFirst();
            while (resultSet.next()){
                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getString("name")) ;
            }
        }
    }
}
