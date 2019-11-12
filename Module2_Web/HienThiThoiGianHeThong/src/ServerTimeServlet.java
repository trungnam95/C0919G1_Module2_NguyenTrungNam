import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet(name = "ServerTimeServlet",urlPatterns = "/index")
public class ServerTimeServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        PrintWriter writer=response.getWriter();
        writer.println("<html>");
        writer.println("<h1>hello world</h1>");
        Date today=new Date();
        writer.println("<h1>"+today+"</h1>");
        writer.println("<html>");
    }
}
