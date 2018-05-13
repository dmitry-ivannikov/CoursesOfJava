import java.sql.*;

public class JDBC15Metadata {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String userName = "root";
        String password = "123qwe";
        String connectionUrl = "jdbc:mysql://localhost:3306/Lessons";
        Class.forName("com.mysql.jdbc.Driver");
        try(Connection conn = DriverManager.getConnection(connectionUrl, userName, password);
            Statement statement = conn.createStatement()){
            statement.executeUpdate("drop table Books");
            statement.executeUpdate("create table if not exists Books (id mediumint not null auto_increment, name char(30) not null, primary key (id));");

            DatabaseMetaData databaseMetaData = conn.getMetaData();
            ResultSet resultSet = databaseMetaData.getTables(null, null, null, new String[] {"Table"});
            while (resultSet.next()){
                System.out.println(resultSet.getString(3));
            }

            System.out.println("_______________");

            ResultSet resultSet2 = statement.executeQuery("select * from Books");
            ResultSetMetaData resultSetMetaData = resultSet2.getMetaData();
            for (int i = 1; i <= resultSetMetaData.getColumnCount(); i++) {
                System.out.println(resultSetMetaData.getColumnLabel(i));
                System.out.println(resultSetMetaData.getColumnType(i));

            }
        }
    }
}
