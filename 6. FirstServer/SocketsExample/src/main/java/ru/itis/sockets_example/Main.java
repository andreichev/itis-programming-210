package ru.itis.sockets_example;

import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        Socket socket = new Socket("localhost", 5432);
    }
}