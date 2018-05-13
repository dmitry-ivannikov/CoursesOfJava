import java.sql.*;

public class JDBC16Transactions_17Bach {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String userName = "root";
        String password = "123qwe";
        String connectionUrl = "jdbc:mysql://localhost:3306/Lessons";
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = null;
        try{
        conn = DriverManager.getConnection(connectionUrl, userName, password);
            Statement statement = conn.createStatement();
            conn.setAutoCommit(false);

            statement.addBatch("drop table Books");
            statement.addBatch("create table if not exists Books (id mediumint not null auto_increment, name char(30) not null, primary key (id));");

            statement.addBatch("insert into Books (name) values ('Inferno')");
            //Savepoint savepoint = conn.setSavepoint();
            statement.addBatch("insert into Books (name) values ('Davinchi')");
            statement.addBatch("insert into Books (name) values ('Solomin')");
            if(statement.executeBatch().length ==5){
                conn.commit();
            }else conn.rollback();

            //conn.rollback(savepoint);//commit
            //conn.commit();
            //conn.releaseSavepoint(savepoint);

            ResultSet resultSet = statement.executeQuery("select * from Books");
            while (resultSet.next()){
                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getString("name"));
            }

    } catch (SQLException e){
            conn.rollback();
        }
}
}
