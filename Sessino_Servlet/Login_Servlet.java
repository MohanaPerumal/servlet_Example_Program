    import java.io.IOException;  
    import java.io.PrintWriter;  
      
    import javax.servlet.ServletException;  
    import javax.servlet.http.HttpServlet;  
    import javax.servlet.http.HttpServletRequest;  
    import javax.servlet.http.HttpServletResponse;  
    import javax.servlet.http.HttpSession;  
    import javax.servlet.annotation.WebServlet;

      @WebServlet("/Login_Servlet")
        public class Login_Servlet extends HttpServlet {  
        protected void doPost(HttpServletRequest request, HttpServletResponse response)  
                        throws ServletException, IOException {  
            response.setContentType("text/html");  
            PrintWriter out=response.getWriter();  
           
            String name=request.getParameter("name");  
            String password=request.getParameter("password");  
              
            if(password.equals("mona_sona")){  
            out.print("Welcome, "+name);  
            HttpSession session=request.getSession();  
            session.setAttribute("name",name);  
            }  
            else{  
                out.print("Sorry, username or password error!");  
                request.getRequestDispatcher("index3.jsp").include(request, response);  
            }  
            request.getRequestDispatcher("index_link.jsp").include(request, response);  
            out.close();  
        }  
    }  