package servlet;

import repository.ProductBucket;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/bucket/clear")
public class ClearBucketServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().removeAttribute("bucket");
        ProductBucket.getBucket().clear();
        resp.sendRedirect(req.getServletContext().getContextPath() + "/product");
    }
}
