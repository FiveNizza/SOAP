package com.prohorov.servletCommand.command;

import com.prohorov.manager.ConfigurationManager;
import com.prohorov.servletCommand.Interface.ActionCommand;

import javax.servlet.http.HttpServletRequest;

/**
 * If no one action to do
 */
public class EmptyCommand implements ActionCommand{

    @Override
    public String execute(HttpServletRequest request) {
        String page = ConfigurationManager.getProperty("path.page.login");
        return page;
    }
}
