import java.sql.*;

public class JDBC5Connect {
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
            ResultSet resultSet = statement.executeQuery("select * from Books");
            while (resultSet.next()){
                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getString("name"));
                System.out.println("---------------------");
            }


            System.out.println("__________________");
            ResultSet rs2 = statement.executeQuery("select name from Books where id = 1");
            while (rs2.next()){
                System.out.println(rs2.getString(1));
            }

//            System.out.println("We`re connected");
        }
    }
}
