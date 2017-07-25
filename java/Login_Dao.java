import java.sql.*;  
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.PrintWriter;
    public class Login_Dao {  
    public static boolean validate(String name,String password){  
    boolean status=false;  
    try{  
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mohana","root","");  
    PreparedStatement ps=con.prepareStatement("select* from serlet_dbc where name=? and password=?");
    ps.setString(1,name);
    ps.setString(2,password);     
    ResultSet rs=ps.executeQuery();  
    status=rs.next();   
              
    }catch(Exception e){System.out.println(e);}  
    return status;  
    }  
    }  