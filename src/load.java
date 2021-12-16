import java.sql.*;

public class load {
    public static void main(String[] args) throws ClassNotFoundException , SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdata","root","");
        Statement S = con.createStatement();
        ResultSet rs = S.executeQuery("select * from databasejdbc");
        while(rs.next())
        {
            System.out.println(rs.getString(1)+rs.getInt(2)+rs.getString(3));
        }


    }
}
