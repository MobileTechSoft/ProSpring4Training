package com.apress.prospring4.ch5.cglib;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class NoOpBeforeAdvice implements MethodBeforeAdvice {
    public void before(Method method, Object[] args, Object target)
        throws Throwable {
        // no-op
    }
}
