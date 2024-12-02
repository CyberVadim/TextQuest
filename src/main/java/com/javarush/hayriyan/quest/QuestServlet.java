package com.javarush.hayriyan.quest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;


@WebServlet("/quest")
public class QuestServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        HttpSession currentSession = req.getSession();
        if (req.getParameter("answer").equals("1")) {
            req.getServletContext().getRequestDispatcher("/step2.jsp").forward(req, resp);
        } else if (req.getParameter("answer").equals("2")) {
            currentSession.setAttribute("text", "Ты отклонил вызов");
            req.getServletContext().getRequestDispatcher("/gameOver.jsp").forward(req, resp);
        } else if (req.getParameter("answer").equals("3")) {
            req.getServletContext().getRequestDispatcher("/step3.jsp").forward(req, resp);
        } else if (req.getParameter("answer").equals("4")) {
            currentSession.setAttribute("text", "Ты не пошёл на переговоры");
            req.getServletContext().getRequestDispatcher("/gameOver.jsp").forward(req, resp);
        } else if (req.getParameter("answer").equals("5")) {
            req.getServletContext().getRequestDispatcher("/step4.jsp").forward(req, resp);
        } else if (req.getParameter("answer").equals("6")) {
            currentSession.setAttribute("text", "Твою ложь разоблачили");
            req.getServletContext().getRequestDispatcher("/gameOver.jsp").forward(req, resp);
        }
    }
}
