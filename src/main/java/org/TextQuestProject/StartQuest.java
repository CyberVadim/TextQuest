package org.TextQuestProject;

import javax.servlet.annotation.WebServlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(value = "/start")
public class StartQuest extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        // Получаем имя игрока из сессии или создаем его, если еще нет
        String playerName = (String) session.getAttribute("playerName");
        if (playerName == null) {
            playerName = "Игрок";
            session.setAttribute("playerName", playerName);
        }

        // Получаем количество сыгранных игр
        Integer gamesPlayed = (Integer) session.getAttribute("gamesPlayed");
        if (gamesPlayed == null) {
            gamesPlayed = 0;
            session.setAttribute("gamesPlayed", gamesPlayed);
        }

        // Логика выбора шага в игре
        String action = request.getParameter("action");
        String gameStatus = (String) session.getAttribute("gameStatus");

        if (action == null || action.isEmpty()) {
            gameStatus = "Добро пожаловать, " + playerName + ". Начнем игру!";
            session.setAttribute("gameStatus", gameStatus);
        } else {
            if ("startNew".equals(action)) {
                session.setAttribute("gameStatus", "Вы начали новую игру! Сражайтесь с врагом!");
            } else if ("quit".equals(action)) {
                session.setAttribute("gameStatus", "Вы проиграли... Игра завершена.");
            }
        }

        // Увеличиваем счетчик сыгранных игр
        gamesPlayed++;
        session.setAttribute("gamesPlayed", gamesPlayed);

        // Переход к странице с игрой
        request.getRequestDispatcher("/game.jsp").forward(request, response);
    }
}
