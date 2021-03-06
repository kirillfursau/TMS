package servlet;

import model.User;
import repository.UserRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/signin.do")
public class SignInServlet extends HttpServlet {
    private static final String LOGIN = "Login";
    private static final String PASSWORD = "Password";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {
        request.setCharacterEncoding("UTF-8");
        User user = new User(request.getParameter(LOGIN), request.getParameter(PASSWORD));
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        if (UserRepository.doesUserExist(user) && UserRepository.checkPassword(user)) {
            HttpSession session = request.getSession();
            session.setAttribute("Login", request.getParameter(LOGIN));
            getServletContext().getRequestDispatcher("/forum.do").forward(request, response);
        } else if (UserRepository.doesUserExist(user)) {
            printHtml("User with this id is already sign up", request, response);
        } else {
            UserRepository.addUser(user);
            printHtml("User sign up", request, response);
        }
    }

    public void printHtml(String text, HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" " +
                "\"http://www.w3.org/TR/html4/loose.dtd\">");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">" +
                " <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\"\n" +
                "          integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n" +
                "    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"\n" +
                "            integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\" crossorigin=\"anonymous\">\n" +
                "    </script>");
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
