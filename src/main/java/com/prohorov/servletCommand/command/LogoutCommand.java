package com.prohorov.servletCommand.command;

import com.prohorov.manager.ConfigurationManager;
import com.prohorov.servletCommand.Interface.ActionCommand;

import javax.servlet.http.HttpServletRequest;

/**
 * Command which responsible for logout
 */
public class LogoutCommand implements ActionCommand{

    @Override
    public String execute(HttpServletRequest request) {
        String page = ConfigurationManager.getProperty("path.page.index");
        request.getSession().invalidate();
        return page;
    }
}
