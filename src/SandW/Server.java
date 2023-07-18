import java.util.*;
import java.io.*;
import java.net.*;

public class Server {
    private Socket socket;
    public Server(int port) {
        try {
            ServerSocket server = new ServerSocket(port);
            System.out.println("Server started");

            System.out.println("Waiting for a client");

            socket = server.accept();
            System.out.println("Client accepted");

        } catch (IOException e) {
            System.out.println(e);
            return;
        }
    }

    public static void main(String[] args) {
        Server cl = new Server(5000);
    }
}
