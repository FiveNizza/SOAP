package com.prohorov;

/**
 * Entity
 */
public class User {
    private String name;
    private String password;

    /**
     * Constructors
     */
    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    /**
     * Getters and Setters
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Overriding method
     */

    @Override
    public String toString() {
        return  "Username: " + getName() + "\n"
                + "Password: " + getPassword();
    }
}
