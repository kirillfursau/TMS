package servlets;

import model.User;
import repository.UserRepository;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SignInServlet extends HttpServlet {
    private static final String LOGIN = "Login";
    private static final String PASSWORD = "Password";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        User user = new User(req.getParameter(LOGIN), req.getParameter(PASSWORD));
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        if (UserRepository.findUser(user) && UserRepository.checkPassword(user)) {
            printHtml("Your login and password is right", req, resp);
        } else if (UserRepository.findUser(user)) {
            printHtml("User with this id is already sign up", req, resp);
        } else {
            UserRepository.addUser(user);
            printHtml("User sign up", req, resp);
        }
    }

    public void printHtml(String text, HttpServletRequest req, HttpServletResponse resp) throws IOException {
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
        out.println("<h1>" + text + "</h1>");
        out.println("<a href=\"" + req.getServletContext().getContextPath() + "/index.html\">Go To Index Page</a>");
    }
}
