package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import someClass.ProductList;

import java.io.IOException;

@WebServlet("/product")
public class ShowListServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProductList productList = new ProductList();
        req.setAttribute("products", productList.getProducts());
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
