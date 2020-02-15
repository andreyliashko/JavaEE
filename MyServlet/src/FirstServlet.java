import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends javax.servlet.http.HttpServlet {
    private static final String loginMain="login";
    private static String passwordMain="password";
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        try{
            String login=request.getParameter("login");
            String password=request.getParameter("password");
            System.out.println(login+" "+password);
            PrintWriter pr=response.getWriter();
            if (login.equals(loginMain)&&password.equals(passwordMain)){
                pr.println("<h1>Enter successful</h1>");
            }else pr.println("<h1>invalid login or password</h1>");
        }catch(Error err){

        }



    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        try{
            PrintWriter pr=response.getWriter();
            pr.println("<html>");
            pr.println("<form  method=\"post\">");
            pr.println(" <h1>Login</h1>\n" +
                    "   <td>\n" +
                    "     <input  type=\"login\" name=\"login\">\n" +
                    "   </td>\n" +
                    "    <h1>Password</h1>\n" +
                    "   <td>\n" +
                    "       <input type=\"password\" name=\"password\">\n" +
                    "   </td>\n" +
                    "    <input type=\"submit\" value=\"Enter\">");

            pr.println("</form>");
            pr.println("</html>");

        }catch (Error e){}






    }
}
