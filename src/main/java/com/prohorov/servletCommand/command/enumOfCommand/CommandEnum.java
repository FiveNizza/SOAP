package com.prohorov.servletCommand.command.enumOfCommand;

import com.prohorov.servletCommand.Interface.ActionCommand;
import com.prohorov.servletCommand.command.LoginCommand;
import com.prohorov.servletCommand.command.LogoutCommand;

/**
 * Enum of command for ActionFactory
 */
/**
 * All command must implement ActionCommand and override 'execute' method
 */

public enum CommandEnum {
    /**Login command*/
    LOGIN{
        {
            this.command = new LoginCommand();

        }
    },
    /**Logout command*/
    LOGOUT{
        {
            this.command = new LogoutCommand();
        }
    };

    ActionCommand command;
    public ActionCommand getCurrentCommand() {
        return command;
    }
}
