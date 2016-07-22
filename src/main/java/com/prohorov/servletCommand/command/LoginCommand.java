package com.prohorov.servletCommand.command;

import com.prohorov.manager.ConfigurationManager;
import com.prohorov.manager.MessageManager;
import com.prohorov.servletCommand.Interface.ActionCommand;

import javax.servlet.http.HttpServletRequest;

/**
 * Command which responsible for login
 */

public class LoginCommand implements ActionCommand{


    @Override
    public String execute(HttpServletRequest request) {
        String page = null;
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        /**
         * Redirect to the main page
         *  or messaging about error(Incorrect password or login)
         */
        if (checkLoginAndPassword(login, password)) {
//            request.getSession().setAttribute("user", login);
           page = ConfigurationManager.getProperty("path.page.index");
        }else {
            request.setAttribute("errorLoginOrPasswordMessage",
                    MessageManager.getProperty("message.loginError"));
            page = ConfigurationManager.getProperty("path.page.error");
        }

        return page;
    }

    /**
     * Method for check login and password
     */
    private boolean checkLoginAndPassword(String login, String password) {
        if (login.equals("admin") && password.equals("admin"))
            return true;

        return false;
    }
}
