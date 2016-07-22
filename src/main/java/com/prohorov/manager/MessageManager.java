package com.prohorov.manager;

import java.util.ResourceBundle;

/**
 * Manager of message
 */

public class MessageManager {
    private MessageManager() {}

    /**
     * Standard configuration of manager
     * with ResourceBundle
     */
    private final static ResourceBundle resourceBundle =
            ResourceBundle.getBundle("resources.message");

    public static String getProperty(String key) {
        return resourceBundle.getString(key);
    }


}
