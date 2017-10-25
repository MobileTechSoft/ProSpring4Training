package com.apress.prospring4.ch4.javaconfig;
public class ConfigurableMessageProvider implements MessageProvider {
    private String message = "java Default message";

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
