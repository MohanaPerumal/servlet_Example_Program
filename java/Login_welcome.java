import java.io.IOException;  
import java.io.PrintWriter;  

import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse; 
import javax.servlet.annotation.WebServlet;

@WebServlet("/Login_welcome") 
public class Login_welcome extends HttpServlet {
    public  void  doPost(HttpServletRequest req1,HttpServletResponse res1) throws ServletException,IOException{
        res1.setContentType("text/html");
        PrintWriter out1=res1.getWriter();
        out1.print("welcome"+req1.getParameter("user_name"));
        out1.close();
    }
    } 