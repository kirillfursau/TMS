package servlet;

import someClass.Product;
import someClass.ProductBucket;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/add")
public class AddToBucketServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int price = Integer.parseInt(req.getParameter("price"));
        ProductBucket.addToBucket(new Product(req.getParameter("product"), price));
        HttpSession session = req.getSession();
        session.setAttribute("bucket", ProductBucket.getBucket());
        resp.sendRedirect(req.getServletContext().getContextPath() + "/product");
    }
}
