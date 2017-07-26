    import java.io.IOException;  
    import java.io.PrintWriter;  
    import javax.servlet.ServletException;  
    import javax.servlet.http.HttpServlet;  
    import javax.servlet.http.HttpServletRequest;  
    import javax.servlet.http.HttpServletResponse;  
    import javax.servlet.http.HttpSession;  
    import javax.servlet.annotation.WebServlet;

    @WebServlet("/Profile_Servlet")
    public class Profile_Servlet extends HttpServlet {  
        protected void doGet(HttpServletRequest request, HttpServletResponse response)  
                          throws ServletException, IOException {  
            response.setContentType("text/html");  
            PrintWriter out=response.getWriter();  
            
            HttpSession session=request.getSession(false);  
            if(session!=null){  
            String name=(String)session.getAttribute("name");  
              
            out.print("Hello, "+name+" Welcome to Profile");  
            }  
            else{  
                out.print("Please login first");  
                request.getRequestDispatcher("index3.jsp").include(request, response);  
            }  
            request.getRequestDispatcher("index_link.jsp").include(request, response);  
            out.close();  
        }  
    }  