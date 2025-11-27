import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)  throws Exception{
        String sql="select name from std_det where id=1;" ;
        String url="jdbc:postgresql://localhost:5432/JDBC";
        String username ="postgres";
        String pass ="Ritheesh123";
        Connection cn = DriverManager.getConnection(url,username,pass);
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        rs.next();
        String name = rs.getString(1);
        System.out.println(name);
        cn.close();

    }
}