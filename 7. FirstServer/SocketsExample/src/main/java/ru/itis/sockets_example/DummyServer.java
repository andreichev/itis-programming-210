package ru.itis.sockets_example;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class DummyServer {
    static void start() {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            System.out.println("SERVER STARTED AT PORT 8080");
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("CLIENT CONNECTED!");

                InputStream inputStream = socket.getInputStream();
                Reader reader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(reader);

                String line;
                while (reader.ready()) {
                    line = bufferedReader.readLine();
                    System.out.println(line);
                }
                socket.close();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
