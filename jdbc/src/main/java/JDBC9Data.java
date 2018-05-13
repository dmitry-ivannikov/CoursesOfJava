import java.sql.*;

public class JDBC9Data {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String userName = "root";
        String password = "123qwe";
        String connectionUrl = "jdbc:mysql://localhost:3306/Lessons";
        Class.forName("com.mysql.jdbc.Driver");
        try(Connection conn = DriverManager.getConnection(connectionUrl, userName, password);
            Statement statement = conn.createStatement()){
            statement.executeUpdate("drop table Books");
            statement.executeUpdate("create table if not exists Books (id mediumint not null auto_increment, name char(30) not null, dt DATE, primary key (id));");

//            PreparedStatement preparedStatement = conn.prepareStatement("insert into Books (name, dt) values('somename', ?) ");
//            preparedStatement.setDate(1, new Date(1514040141845L));
//            preparedStatement.execute();
//            System.out.println(preparedStatement);

            statement.executeUpdate("insert into Books (name, dt) values ('somename2', '2017-02-08')");
            ResultSet resultSet = statement.executeQuery("select * from  Books");
            while (resultSet.next()){
                System.out.println(resultSet.getDate("dt"));
            }
        }
    }
}
