package servlet;

import lessons.lesson11.DateUtils;
import model.Message;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/forum.do")
public class ForumServlet extends HttpServlet {
    private static final String LOGIN = "Login";
    private static final String MESSAGE = "user_message";
    public static List<Message> messagesList = new ArrayList<>();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        if (request.getParameter(MESSAGE) != null && !request.getParameter(MESSAGE).equals("")) {
            Message message = new Message((String) session.getAttribute(LOGIN), request.getParameter(MESSAGE),
                    new DateUtils().printNowDate());
            messagesList.add(message);
        }
        printHtml(request, response, session);
    }

    public static void printMessage(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter out = resp.getWriter();
        for (Message item : messagesList) {
            out.println("<div>");
            out.println("<table>");
            out.printf("<tr id=tr_'%s'><td class = 'name'><br >%s</br><br class = 'time'>%s</br></td>" +
                            "<td class ='message'>%s</td>",
                    item.getUserName(), item.getUserName(), item.getDateTime(), item.getUserMessage());
            out.println("</table>");
            out.println("</div>");
        }
    }

    public static void printHtml(HttpServletRequest req, HttpServletResponse resp, HttpSession session)
            throws IOException, ServletException {
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" " +
                "\"http://www.w3.org/TR/html4/loose.dtd\">");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
        out.println("<link rel='stylesheet' href='/com_forum_war_exploded2/main.css' type='text/css'>" +
                " <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\"\n" +
                "          integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n" +
                "    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"\n" +
                "            integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\" crossorigin=\"anonymous\">\n" +
                "    </script>");
        out.println("<title>Forum</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<center>");
        out.println("<h1>Forum Messages</h1>");
        out.println("</center>");
        out.println("<form action=\"forum.do\" method=\"post\">");
        out.println("<div id=\"authorize_field\">");
        out.println("<input type=\"button\" value=\"Sign out\" " +
                "onClick='location.href=\"http://localhost:8081/com_forum_war_exploded2/index.html\"'>");
        out.println("<p>You sign in with login " + session.getAttribute(LOGIN) + "</p>");
        out.println("<p>Enter your massage</p>");
        out.println("<input id=\"user_message\" type=\"text\" name=\"user_message\" size=\"150%\">");
        out.println("<td align=\"right\">");
        out.println("<input type=\"submit\" value=\"Send message\"/>");
        out.println("</td>");
        out.println("<tr>");
        out.println("<button onClick=\"http://localhost:8081/com_forum_war_exploded2/forum.do\">" +
                "Refresh messages</button>");
        out.println("</tr>");
        out.println("</div>");
        out.println("</form>");
        printMessage(req, resp);
        out.println("<div id=\"chat_field\">");
        out.println("</div>");
        out.println("</body>");
    }
}
