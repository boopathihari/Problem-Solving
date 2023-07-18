import java.util.*;
import java.io.IOException;
import java.net.*;

public class Client {

    public Client(String address, int port) {
        try {
            Socket s = new Socket(address, port);
            System.out.println("Connected");

        } catch (IOException e) {
            System.out.println(e);
            return;
        }
    }

    public static void main(String[] args) {
        Client cl = new Client("localhost", 5000);
    }
}
