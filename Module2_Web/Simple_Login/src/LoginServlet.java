import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet",urlPatterns = "/login")
public class LoginServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String userName=request.getParameter("userName");
        String passWord=request.getParameter("passWord");
        PrintWriter writer=response.getWriter();
        writer.println("<html>");
        if("admin".equals(userName)&&"admin".equals(passWord)){
            writer.println("<h1>Welcome"+userName+"</h1>");
        }else {
            writer.println("<h1>Login Error</h1>");
        }
        writer.println("</html>");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
