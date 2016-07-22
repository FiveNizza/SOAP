package com.prohorov.manager;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Manager of view files
 * */

public class ConfigurationManager {
    private ConfigurationManager() {}

    /**
     * Standard configuration of manager
     * with ResourceBundle
     * */
    private final static ResourceBundle resourceBundle =
            ResourceBundle.getBundle("configViews");

    public static String getProperty(String key) {
        return resourceBundle.getString(key);
    }
}
