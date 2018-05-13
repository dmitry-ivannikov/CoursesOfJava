import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.*;

public class JDBC8BLOB {

    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
        String userName = "root";
        String password = "123qwe";
        String connectionUrl = "jdbc:mysql://localhost:3306/Lessons";
        Class.forName("com.mysql.jdbc.Driver");
        try(Connection conn = DriverManager.getConnection(connectionUrl, userName, password);
            Statement statement = conn.createStatement()){
            statement.executeUpdate("drop table if exists Books");
            statement.executeUpdate("create table if not exists Books (id mediumint not null auto_increment, name char(30) not null, img BLOB, primary key (id));");

            BufferedImage image = ImageIO.read(new File("foto.jpg"));
            Blob blob = conn.createBlob();
            try (OutputStream outputStream = blob.setBinaryStream(1)) {
                ImageIO.write(image, "jpg", outputStream);
            }

            PreparedStatement statement2 = conn.prepareStatement("insert into Books (name, img) values(?,?)");
            statement2.setString(1, "inferno");
            statement2.setBlob(2, blob);
//            statement1.execute();

            ResultSet resultSet = statement.executeQuery("select * from Books");
            while (resultSet.next()) {
                Blob blob2 = resultSet.getBlob("img");
                BufferedImage image2 = ImageIO.read(blob.getBinaryStream());
                File outFile =  new File("saved.png");
                ImageIO.write(image2, "png", outFile);
            }
        }
    }
}
