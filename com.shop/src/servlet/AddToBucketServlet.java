package servlet;

import model.Product;
import repository.ProductBucket;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/bucket/add")
public class AddToBucketServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProductBucket.addToBucket(new Product(req.getParameter("product"),
                Integer.parseInt(req.getParameter("price"))));
        req.getSession().setAttribute("bucket", ProductBucket.getBucket());
        resp.sendRedirect(req.getServletContext().getContextPath() + "/product");
    }
}
