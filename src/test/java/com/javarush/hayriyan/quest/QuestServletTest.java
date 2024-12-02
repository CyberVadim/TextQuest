package com.javarush.hayriyan.quest;
 import org.junit.jupiter.api.Test;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
 import javax.servlet.http.HttpSession;

public class QuestServletTest {

    @Test
    public void doGetTest() throws ServletException, IOException {
        QuestServlet questServlet = new QuestServlet();
        HttpSession session = mock(HttpSession.class);

        HttpServletRequest request = mock(HttpServletRequest.class);
        when(request.getSession()).thenReturn(session);

        HttpServletResponse response = mock(HttpServletResponse.class);
        ServletContext servletContext = mock(ServletContext.class);
        RequestDispatcher dispatcher = mock(RequestDispatcher.class);
        servletContext.setAttribute("answer", "2");

        when(request.getServletContext()).thenReturn(servletContext);
        when(request.getParameter("answer")).thenReturn("2");
        when(servletContext.getRequestDispatcher("/gameOver.jsp")).thenReturn(dispatcher);
        questServlet.doGet(request, response);

        verify(servletContext, times(1)).getRequestDispatcher("/gameOver.jsp");
        assertEquals("2", request.getParameter("answer"));
    }


}