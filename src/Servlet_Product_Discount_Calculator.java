import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet_Product_Discount_Calculator",urlPatterns = "/display-discount")
public class Servlet_Product_Discount_Calculator extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Double List_Price =Double.parseDouble(request.getParameter("List Price"));
        Double Discount_Percent = Double.parseDouble(request.getParameter("Discount Percent"));

        Double Discount_Amount = List_Price * Discount_Percent * 0.01;
        Double Discount_Price = List_Price -Discount_Amount;

        PrintWriter writer =response.getWriter();
        writer.println("<h1> Discount Amount: "+Discount_Amount+"</h1>");
        writer.println("<h1>Discount Price: " +Discount_Price+"<h1>");


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
