package ru.itis.java_web.session_example.listeners;

import ru.itis.java_web.session_example.repository.UserRepository;
import ru.itis.java_web.session_example.repository.impl.UserRepositoryMemoryImpl;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class AppContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();

        UserRepository userRepository = new UserRepositoryMemoryImpl();
        servletContext.setAttribute("userRepository", userRepository);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
