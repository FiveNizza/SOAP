package com.prohorov.servlet;

import com.prohorov.manager.ConfigurationManager;
import com.prohorov.manager.MessageManager;
import com.prohorov.servletCommand.Interface.ActionCommand;
import com.prohorov.servletCommand.factory.ActionFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Main Servlet
 * */

@WebServlet("/controller")
public class Controller extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String page = null;
        ActionFactory client = new ActionFactory();
        ActionCommand command = client.defineCommand(request);

        page = command.execute(request);
        if (page != null) {
            /**
             * Redirect to some page.
             * */
            RequestDispatcher dispatcher =
                    getServletContext().getRequestDispatcher(page);
            dispatcher.forward(request, response);
//            request.getSession().getAttribute(page);
        } else {
            /**
             * Redirect to login
             * */
            page = ConfigurationManager.getProperty("path.page.login");
//            request.getSession().setAttribute("nullPage",
//                    MessageManager.getProperty("message.nullPage"));
            response.sendRedirect(request.getContextPath() + page);
            RequestDispatcher dispatcher =
                    getServletContext().getRequestDispatcher(page);
//            request.getSession().getAttribute(page);
            dispatcher.forward(request, response);
        }
    }
}
