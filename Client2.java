
package mypack;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client2 implements ChatClient {
    private final Socket socket;
    private final PrintWriter out;
    private final BufferedReader in;
    private final String name;

    public Client2(String host, int port, String name) throws IOException {
        this.name = name;
        this.socket = new Socket(host, port);
        this.out = new PrintWriter(socket.getOutputStream(), true);
        this.in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    }

    @Override
    public void sendMessage(String message) {
        out.println(message);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(message);
    }

    public void start() {
        try {
            new Thread(() -> {
                try {
                    String serverMessage;
                    while ((serverMessage = in.readLine()) != null) {
                        receiveMessage(serverMessage);
                    }
                } catch (IOException e) {
                }
            }).start();

            sendMessage(name); // Send name to server

            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.print("Enter message: ");
                String message = scanner.nextLine();
                sendMessage(message);
            }
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        try {
            ChatClientImpl client2 = new ChatClientImpl("localhost", 1234, "Lagatic");
            client2.start();
        } catch (IOException e) {
        }
    }
}
