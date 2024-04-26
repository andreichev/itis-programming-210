package ru.itis.application_context_example.listeners;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class InitListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("ru.itis.application_context_example");
        context.setAttribute("app", applicationContext);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
