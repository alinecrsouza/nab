package br.com.nab.mvc.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.nab.mvc.logic.Logic;

/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet("/mvc")
public class ControllerServlet extends HttpServlet {
    protected void service(HttpServletRequest request,
            HttpServletResponse response) 
            throws ServletException, IOException {

        String parameter = request.getParameter("logic");
        String nameOfClass = "br.com.nab.mvc.logic." + parameter;

        try {
            Class classe = Class.forName(nameOfClass);

            Logic logic = (Logic) classe.newInstance();
            String page = logic.runs(request, response);

  request.getRequestDispatcher(page).forward(request, response);

        } catch (Exception e) {
            throw new ServletException(
              "Business logic caused an exception", e);
        }
    }
}
