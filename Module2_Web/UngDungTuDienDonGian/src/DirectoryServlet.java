import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "DirectoryServlet",urlPatterns = "")
public class DirectoryServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        Map<String,String> directory=new HashMap<>();
        directory.put("hello","Xin Chao");
        directory.put("School","Truong Hoc");
        String search=request.getParameter("txtSearch");
        PrintWriter writer=response.getWriter();
        writer.println("<html>");
        String result=directory.get(search);
        if(result!=null){
            writer.println("Word: "+search);
            writer.println("Result: "+result);
        }else {
            writer.println("Not Found");
        }
        writer.println("</html>");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String nextJSP = "/123.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request,response);

    }
}
