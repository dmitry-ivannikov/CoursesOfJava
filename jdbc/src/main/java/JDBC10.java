import java.sql.*;

public class JDBC10 {
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
            statement.executeUpdate("insert into Books set name = 'Solomon key'");

            CallableStatement callableStatement = conn.prepareCall("{call BooksCount(?)}");
            callableStatement.registerOutParameter(1, Types.INTEGER);
            callableStatement.execute ();
            System.out.println(callableStatement.getInt(1));
            System.out.println("---------------------");
        }
    }
}
