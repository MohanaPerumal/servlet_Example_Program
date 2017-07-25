/*import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.PrintWriter;*/

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;  
import java.util.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/Login_DB")
public class Login_DB extends HttpServlet{
    public  void  doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{

res.setContentType("text/html");
PrintWriter out=res.getWriter();

String n=req.getParameter("user_name");
String p=req.getParameter("pass_word");
//try{
/*Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mohana","root","");
PreparedStatement ps=con.prepareStatement("select* from serlet_dbc where name=? and password=?");
//ps.setString(1,name);
//ps.setString(2,password);
ResultSet rs=ps.executeQuery();
//status=rs.next();*/
//if(rs.equals(n) && rs.equals(p)){
 if(Login_Dao.validate(n, p)){  
    RequestDispatcher rd=req.getRequestDispatcher("Login_welcome");
    rd.forward(req,res);
}else{
    out.print("Sorry Your password & username are wrong");
      RequestDispatcher rd=req.getRequestDispatcher("login_DB.jsp");
    rd.include(req,res);
}

/*}catch(Exception e){
e.printStackTrace();
}*/
out.close();


    }
}

 