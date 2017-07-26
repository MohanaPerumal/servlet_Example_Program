    import java.io.IOException;  
    import java.io.PrintWriter;  
      
    import javax.servlet.ServletException;  
    import javax.servlet.http.HttpServlet;  
    import javax.servlet.http.HttpServletRequest;  
    import javax.servlet.http.HttpServletResponse;  
    import javax.servlet.http.HttpSession;  
    import javax.servlet.annotation.WebServlet;

    @WebServlet("/Logout_Servlet")
    public class Logout_Servlet extends HttpServlet {  
            protected void doPost(HttpServletRequest request, HttpServletResponse response)  
                                    throws ServletException, IOException {  
                response.setContentType("text/html");  
                PrintWriter out=response.getWriter();  
                HttpSession session=request.getSession();  
                session.invalidate();  
                  
                out.print("You are successfully logged out!");  
                 request.getRequestDispatcher("index_link.jsp").include(request, response); 
                  
                out.close();  
        }  
    }  