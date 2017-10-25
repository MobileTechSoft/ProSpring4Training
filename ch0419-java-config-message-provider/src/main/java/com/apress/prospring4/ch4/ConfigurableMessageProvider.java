package com.apress.prospring4.ch4;

/**
 * Author: 王俊超
 * Date: 2015-12-10
 * Time: 15:55
 * Declaration: All Rights Reserved !!!
 */
public class ConfigurableMessageProvider implements MessageProvider {
    private String message = "Default message";

    public ConfigurableMessageProvider() {

    }

    public ConfigurableMessageProvider(String message) {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
