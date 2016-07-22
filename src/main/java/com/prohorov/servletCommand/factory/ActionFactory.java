package com.prohorov.servletCommand.factory;

import com.prohorov.manager.MessageManager;
import com.prohorov.servletCommand.command.EmptyCommand;
import com.prohorov.servletCommand.Interface.ActionCommand;
import com.prohorov.servletCommand.command.enumOfCommand.CommandEnum;

import javax.servlet.http.HttpServletRequest;

/**
 * Action Factory which control all command and views redirect
 */
public class ActionFactory {
    public ActionCommand defineCommand(HttpServletRequest request) {
        ActionCommand current = new EmptyCommand();
        String action  = request.getParameter("command");


        if (action == null || action.isEmpty()) {
            return current;
        }

        try {
            CommandEnum currentEnum =
                    CommandEnum.valueOf(action.toUpperCase());
            current = currentEnum.getCurrentCommand();
        } catch (IllegalArgumentException e) {
            request.setAttribute("wrongAction", action +
                    MessageManager.getProperty("message.wrongAction"));
        }
        return current;
    }
}
