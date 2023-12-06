package ru.itis.basic_web_app.listeners;

import ru.itis.basic_web_app.repository.UsersRepository;
import ru.itis.basic_web_app.repository.impl.UsersRepositoryImpl;
import ru.itis.basic_web_app.service.AuthService;
import ru.itis.basic_web_app.service.PasswordEncoder;
import ru.itis.basic_web_app.service.impl.AuthServiceImpl;
import ru.itis.basic_web_app.service.impl.PasswordEncoderImpl;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@WebListener
public class InitListener implements ServletContextListener {
    private static final String DB_USERNAME = "postgres";
    private static final String DB_PASSWORD = "123123";
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/java_web_database";
    private static final String DB_DRIVER = "org.postgresql.Driver";

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        try {
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException e) {
            System.out.println("Postgresql Driver not found.");
        }
        Connection connection = null;
        try {
            connection =
                    DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        } catch (SQLException e) {
            System.out.println("ERROR CONNECTING TO DATABASE: " + e.getMessage());
        }

        UsersRepository usersRepository = new UsersRepositoryImpl(connection);
        PasswordEncoder passwordEncoder = new PasswordEncoderImpl();
        AuthService authService = new AuthServiceImpl(usersRepository, passwordEncoder);

        ServletContext servletContext = sce.getServletContext();
        servletContext.setAttribute("usersRepository", usersRepository);
        servletContext.setAttribute("authService", authService);
    }
}
