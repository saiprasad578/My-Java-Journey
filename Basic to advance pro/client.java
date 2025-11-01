import java.io.*;
import java.net.*;
import java.util.Scanner;

public class client {
    public static void main(String[] args) {
        String hostname = "localhost"; // Server address
        int port = 5000;

        try (Socket socket = new Socket(hostname, port)) {
            System.out.println("Connected to server.");

            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            Scanner scanner = new Scanner(System.in);

            String userInput;
            while (true) {
                System.out.print("Enter message: ");
                userInput = scanner.nextLine();
                output.println(userInput); // Send to server

                String response = input.readLine();
                System.out.println(response);

                if (userInput.equalsIgnoreCase("bye"))
                    break;
            }

            socket.close();
            System.out.println("Disconnected.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
