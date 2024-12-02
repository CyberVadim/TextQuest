package com.javarush.hayriyan.quest;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/createUser")
public class CreateUserServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        HttpSession currentSession = req.getSession(true);
        int gamesCount = 0;
        if (currentSession.getAttribute("games") != null) {
            gamesCount = (int)currentSession.getAttribute("games");
        }
        currentSession.setAttribute("games",  gamesCount + 1);
        currentSession.setAttribute("ip", req.getRemoteAddr());
        currentSession.setAttribute("username", req.getParameter("username"));
        req.getServletContext().getRequestDispatcher("/step1.jsp").forward(req, resp);
    }
}