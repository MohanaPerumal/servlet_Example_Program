# Bootstrap 
Each servlet contain the separate picture. Each button have link with separate servlets, So when a button  is clicked, the related picture displayed. 
## Page1
```import java.io.IOException; 
import java.io.PrintWriter; 
import java.io.*;
import java.util.*;

import javax.servlet.ServletException; 
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse; 
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

@WebServlet("/page1")
public class page1 extends HttpServlet{
    public void doPost(HttpServletRequest req1,HttpServletResponse res1)throws ServletException,IOException{
        res1.setContentType("text/html");
        PrintWriter pr=res1.getWriter();
        req1.getRequestDispatcher("index.html").include(req1, res1);  
        pr.print("<center><h1>Welcome mona </h1></center>");
        //pr.print("padding-top:100px;");
       pr.print("<html lang='en'>");
       pr.print ("<head>");
  pr.print (" <title>Bootstrap Example</title>");
  pr.print (" <meta charset='utf-8'>");
  pr.print (" <meta name='viewport' content='width=device-width, initial-scale=1'>");
   pr.print ("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css'>");
   pr.print ("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
  pr.print (" <script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js'></script>");

  pr.print ("<style>");
  pr.print (".jumbotron");
   pr.print (" {");
   pr.print (" background-image:url(http://pgwebdesign.net/wp-content/uploads/2011/03/white-angel-dragon.jpg);");
   pr.print (" height:500px;");
    pr.print ("background-repeat: no-repeat;");
    pr.print ("background-size: cover;");
    pr.print ("border-bottom:1px solid #ff6a00");
   pr.print (" }");
 pr.print ("</style>");

 pr.print ("</head>");
 pr.print ("<body>");
 pr.print ("<div class='container'>");
   pr.print ("<h1><div align='center'></div></h1>");
 pr.print ("<div class ='jumbotron'>");
 pr.print("</div>");
 pr.print("</body>");
 pr.print("</html>");
       pr.close();  
       
    }  
    }
```
     
## Page2
```import java.io.IOException; 
import java.io.PrintWriter; 
import java.io.*;
import java.util.*;
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse; 
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

@WebServlet("/page2")
public class page2 extends HttpServlet{
    public void doPost(HttpServletRequest req1,HttpServletResponse res1)throws ServletException,IOException{
        res1.setContentType("text/html");
        PrintWriter pr=res1.getWriter();
        req1.getRequestDispatcher("index.html").include(req1, res1);  
        pr.print("<center><h1>Welcome sona</h1></center>");
      
       pr.print("<html lang='en'>");
       pr.print ("<head>");
  pr.print (" <title>Bootstrap Example</title>");
  pr.print (" <meta charset='utf-8'>");
  //pr.print (" <meta name='viewport' content='width=device-width, initial-scale=1'>");
   pr.print ("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css'>");
   pr.print ("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
  pr.print (" <script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js'></script>");

  pr.print ("<style>");
  pr.print (".jumbotron");
   pr.print (" {");
   pr.print (" background-image:url(https://s-media-cache-ak0.pinimg.com/736x/53/9b/65/539b656998d2d234356db92ea757d1d9--fractal-art-fractals.jpg);");
  pr.print (" height:500px;");
    pr.print ("background-repeat: no-repeat;");
    pr.print ("background-size: cover;");
    pr.print ("border-bottom:1px solid #ff6a00");
   pr.print (" }");
 pr.print ("</style>");

 pr.print ("</head>");
 pr.print ("<body>");
 pr.print ("<div class='container'>");
   pr.print ("<h1><div align='center'></div></h1>");
 pr.print ("<div class ='jumbotron'>");
 pr.print("</div>");
 pr.print("</body>");
 pr.print("</html>");
       pr.close();  
       
    }  
    }
```

## Page3


```
import java.io.IOException; 
import java.io.PrintWriter; 
import java.io.*;
import java.util.*;
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse; 
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
 

@WebServlet("/page3")
public class page3 extends HttpServlet{
    public void doPost(HttpServletRequest req1,HttpServletResponse res1)throws ServletException,IOException{
        res1.setContentType("text/html");
        PrintWriter pr=res1.getWriter();
         req1.getRequestDispatcher("index.html").include(req1, res1); 
        pr.print("<center><h1>Welcome yana</h1></center>");
         
        
     pr.print("<html lang='en'>");
       pr.print ("<head>");
  pr.print (" <title>Bootstrap Example</title>");
  pr.print (" <meta charset='utf-8'>");
  pr.print (" <meta name='viewport'      content='width=device-width, initial-scale=1'>");
     pr.print ("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css'>");
   pr.print ("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
        pr.print (" <script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js'></script>");

  pr.print ("<style>");
  pr.print (".jumbotron");
   pr.print (" {");
   pr.print (" background-image:url(https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQSlTtkuKBKrq83ewDCWDv-Ql3qyvJ1p_ewc0ZXvUVLrrl0-VbQ);");
   pr.print (" height:500px;");
    pr.print ("background-repeat: no-repeat;");
    pr.print ("background-size: cover;");
    pr.print ("border-bottom:1px solid #ff6a00");
   pr.print (" }");
 pr.print ("</style>");

 pr.print ("</head>");
 pr.print ("<body>");
 pr.print ("<div class='container'>");
   pr.print ("<h1><div align='center'></div></h1>");
 pr.print ("<div class ='jumbotron'>");
 pr.print("</div>");
 pr.print("</body>");
 pr.print("</html>");
       pr.close();  
       
    }  
    }
```
## Page4
```
  
import java.io.IOException; 
import java.io.PrintWriter; 
import java.io.*;
import java.util.*;
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse; 
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


@WebServlet("/page4")
public class page4 extends HttpServlet{
    public void doPost(HttpServletRequest req1,HttpServletResponse res1)throws ServletException,IOException{
        res1.setContentType("text/html");
        PrintWriter pr=res1.getWriter();
         req1.getRequestDispatcher("index.html").include(req1, res1);  
        pr.print("<center><h1>Welcome sonaa</h1></center>");
        
   pr.print("<html lang='en'>");
       pr.print ("<head>");
  pr.print (" <title>Bootstrap Example</title>");
  pr.print (" <meta charset='utf-8'>");
  pr.print (" <meta name='viewport' content='width=device-width, initial-scale=1'>");
   pr.print ("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css'>");
   pr.print ("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
  pr.print (" <script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js'></script>");

  pr.print ("<style>");
  pr.print (".jumbotron");
   pr.print (" {");
   pr.print (" background-image:url(http://s4.thingpic.com/images/VL/nbnZ9t41akCjAFcRDnkLbFt5.jpeg);");
   pr.print (" height:500px;");
    pr.print ("background-repeat: no-repeat;");
    pr.print ("background-size: cover;");
    pr.print ("border-bottom:1px solid #ff6a00");
   pr.print (" }");
 pr.print ("</style>");

 pr.print ("</head>");
 pr.print ("<body>");
 pr.print ("<div class='container'>");
   pr.print ("<h1><div align='center'></div></h1>");
 pr.print ("<div class ='jumbotron'>");
 pr.print("</div>");
 pr.print("</body>");
 pr.print("</html>");
       pr.close();  
       
    }  
    }



```

## Screenshots
![index_picture1](https://github.com/MohanaPerumal/servlet_Example_Program/blob/master/index_picture.png)

![page1_picture](https://github.com/MohanaPerumal/servlet_Example_Program/blob/master/page1_picture.png)

![page2_picture](https://github.com/MohanaPerumal/servlet_Example_Program/blob/master/page2_picture.png)

![page3_picture](https://github.com/MohanaPerumal/servlet_Example_Program/blob/master/page3_picture.png)

![page4_picture](https://github.com/MohanaPerumal/servlet_Example_Program/blob/master/page4_picture.png)