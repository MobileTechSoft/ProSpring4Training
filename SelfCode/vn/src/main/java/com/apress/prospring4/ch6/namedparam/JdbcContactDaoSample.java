package com.apress.prospring4.ch6.namedparam;


import org.springframework.context.support.GenericXmlApplicationContext;

public class JdbcContactDaoSample {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:ch6.jdbc.namedparam/META-INF/spring/app-context-xml.xml");
        ctx.refresh();

        ContactDao contactDao = ctx.getBean("contactDao", ContactDao.class);

        System.out.println("Last name for contact id 1 is: " +
                contactDao.findLastNameById(1l));
    }
}
