import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.sql.*;

public class JDBC14CachedRowSet {

    static String url = "jdbc:mysql://localhost:3306/Lessons?relaxAutoCommit=false";
    static String userName = "root";
    static String password = "123qwe";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ResultSet resultSet = getData();
        while (resultSet.next()){
            System.out.println(resultSet.getInt("id"));
            System.out.println(resultSet.getString("name"));
        }

        CachedRowSet cachedRowSet = (CachedRowSet) resultSet;
        cachedRowSet.setUrl(url);
        cachedRowSet.setUsername(userName);
        cachedRowSet.setPassword(password);
        cachedRowSet.setCommand("select * form Books where id = ?");
//        cachedRowSet.setInt(1, 1);
//        cachedRowSet.setPageSize(2);
//       // cachedRowSet.execute();
//        do {
//            while (cachedRowSet.next()){
//                System.out.println(cachedRowSet.getInt("id"));
//                System.out.println(cachedRowSet.getString("name"));
//            }
//        }while (cachedRowSet.nextPage());

        CachedRowSet cachedRowSet2 = (CachedRowSet)resultSet;
        cachedRowSet2.setTableName("Books");
        cachedRowSet2.absolute(1);
        cachedRowSet2.deleteRow();
        cachedRowSet2.beforeFirst();
        while (cachedRowSet2.next()){
            System.out.println(cachedRowSet2.getInt("id"));
            System.out.println(cachedRowSet2.getString("name"));
        }
        cachedRowSet2.acceptChanges(DriverManager.getConnection(url, userName, password));

    }



    static ResultSet getData() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        try(Connection conn = DriverManager.getConnection(url, userName, password);
            Statement statement = conn.createStatement()){
            statement.executeUpdate("drop table Books");
            statement.executeUpdate("create table if not exists Books (id mediumint not null auto_increment, name char(30) not null, primary key (id));");
            statement.executeUpdate("insert into Books (name) values ('Inferno')");
            statement.executeUpdate("insert into Books (name) values ('Davinchi')");
            statement.executeUpdate("insert into Books (name) values ('Solomin')");


            RowSetFactory factory = RowSetProvider.newFactory();
            CachedRowSet cachedRowSet = factory.createCachedRowSet();

            Statement statement1 = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet resultSet = statement1.executeQuery("select * from Books");
            cachedRowSet.populate(resultSet);
            return cachedRowSet;



        }

    }
}
