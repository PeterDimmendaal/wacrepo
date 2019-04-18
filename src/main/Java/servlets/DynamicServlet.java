package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class DynamicServlet extends HttpServlet {
    public double answer;
    protected void doGet (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        double n1 = Integer.parseInt(request.getParameter("Int1"));
        double n2 = Integer.parseInt(request.getParameter("Int2"));
        String go = request.getParameter("go");

        if(go.equals("+")){
            answer = (n1 + n2);
        }
        if(go.equals("-")){
            answer= (n1-n2);
        }
        if(go.equals("x")){
            answer = n1 * n2;
        }
        if(go.equals(":")){
            answer= n1 / n1;
        }

        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("<!DOCTYPE html>");
        out.println( "<html>");
        out.println("<head>");
        out.println(" <title>Dynamic Example</title>");
        out.println("</head>");
        out.println("<body>");
        out.println(" <h2>Dynamic webapplication example</h2>");
        out.println(" <h2>Answer "+ n1 + go + n2 + "= " + answer  +"!</h2>");
        out.println("</body>");
        out.println("</html>");
    }
}