package servlet;

import lessons.lesson11.DateUtils;
import model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ForumServlet extends HttpServlet {
    private static final String NAME = "user_name";
    private static final String MESSAGE = "user_message";
    public static List<User> users = new ArrayList<>();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        if (req.getParameter(NAME) != "" && req.getParameter(MESSAGE) != "" &&
                req.getParameter(NAME) != null && req.getParameter(MESSAGE) != null) {
            User user = new User(req.getParameter(NAME), req.getParameter(MESSAGE), new DateUtils());
            users.add(user);
        }
        printHtml(req, resp);
    }


    public static void printMessage(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter out = resp.getWriter();
        for (User item : users) {
            out.println("<div>");
            out.println("<table>");
            out.printf("<tr id=tr_'%s'><td class = 'name'><br >%s</br><br class = 'time'>%s</br></td>" +
                            "<td class ='message'>%s</td>",
                    item.getName(), item.getName(), item.getDateUtils(), item.getMessage());
            out.println("</table>");
            out.println("</div>");
        }
    }

    public static void printHtml(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
        out.println("<link rel='stylesheet' href='/com_forum_war_exploded2/main.css' type='text/css'>");
        out.println("<title>Forum</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<center>");
        out.println("<h1>Forum Messages</h1>");
        out.println("</center>");
        printMessage(req, resp);
        out.println("</body>");
        out.println("<a href=\"" + req.getServletContext().getContextPath() + "/index.html\">Go to message page</a>");
        out.println("<a href=\"" + req.getServletContext().getContextPath() + "/forum.do\">Refresh messages</a>");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
