package servlet;

import model.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ForumServlet extends HttpServlet {
    private static final String NAME = "user_name";
    private static final String MESSAGE = "user_massage";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        User user = new User(req.getParameter(NAME), req.getParameter(MESSAGE));
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
        out.println("<title>Sign in</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<center>");
        out.println("<h1>Registration</h1>");
        out.println("</center>");
        out.println("<h1>" + user.getMessage() + user.getName() + "</h1>");
        out.println("<a href=\"" + req.getServletContext().getContextPath() + "/index.html\">Go To Index Page</a>");
    }
}
