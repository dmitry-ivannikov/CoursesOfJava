import java.sql.*;

public class JDBC7Injection_PS {


    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String userName = "root";
        String password = "123qwe";
        String connectionUrl = "jdbc:mysql://localhost:3306/Lessons";
        Class.forName("com.mysql.jdbc.Driver");
        try(Connection conn = DriverManager.getConnection(connectionUrl, userName, password);
            Statement statement = conn.createStatement()){
            statement.executeUpdate("drop table Users");
            statement.executeUpdate("create table if not exists Users (id mediumint not null auto_increment, name char(30) not null, password char(30) not null, primary key (id));");
            statement.executeUpdate("insert into Users (name, password) values ('Testovich', '123')");
            statement.executeUpdate("insert into Users set name = 'Burevich', password = '321'");

            String userId = "1";
//            String userId = "1"; ---------> Это всё плохо не надо так делать
//            ResultSet resultSet = statement.executeQuery("select * from Users where id = '"+ userId +"'");
//            while (resultSet.next()){
//                System.out.println("userName: " + resultSet.getString("name") );
//                System.out.println("userPassword:" + resultSet.getString("password"));
//            }
            PreparedStatement preparedStatement = conn.prepareStatement("select  * from Users where id = ?");
            preparedStatement.setString(1, userId);
//            preparedStatement.setString(2, "userName");
            ResultSet resultSet = preparedStatement.executeQuery() ;
            while(resultSet.next()){
                System.out.println("userName: " + resultSet.getString("name"));
                System.out.println("userPass: " + resultSet.getString("password"));
            }

        }
    }
}
