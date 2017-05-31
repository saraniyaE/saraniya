package sarann;


import static java.lang.ProcessBuilder.Redirect.from;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;   

/**
 *
 * @author Administrator
 */
public class sarann{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
    
       try {  
        // TODO code application logic here
        
        //step2 create  the connection object  
        Connection con;
 con = DriverManager.getConnection("jdbc:oracle:thin:@172.16.0.70:1521:cas","fdp14","fdp14");  
Statement stmt;
        stmt=con.createStatement();  
  
//step4 execute query  
ResultSet rs;  
           rs = stmt.executeQuery("select * from address14");
while(rs.next())  
System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
 if (con != null){
System.out.println("Connected with status");
}
else
{
System.out.println("Not yet Connected");
} }catch(SQLException e){ System.out.println(e);}
        
    
    }    
}