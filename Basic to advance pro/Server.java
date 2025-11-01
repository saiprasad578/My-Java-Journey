import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        int port = 5000; // Port number for server
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server started. Waiting for client connection...");

            Socket socket = serverSocket.accept(); // Wait for client
            System.out.println("Client connected!");

            // Input and Output streams
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            String clientMessage;
            while ((clientMessage = input.readLine()) != null) {
                System.out.println("Client says: " + clientMessage);
                if (clientMessage.equalsIgnoreCase("bye")) {
                    output.println("Goodbye!");
                    break;
                }
                output.println("Server: " + clientMessage.toUpperCase()); // Respond
            }

            socket.close();
            System.out.println("Connection closed.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
