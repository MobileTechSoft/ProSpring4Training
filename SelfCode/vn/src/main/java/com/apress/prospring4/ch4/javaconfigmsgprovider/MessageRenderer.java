package com.apress.prospring4.ch4.javaconfigmsgprovider;

public interface MessageRenderer {
    void render();
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}
