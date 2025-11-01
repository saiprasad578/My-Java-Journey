import java.io.*;
import java.net.*;

public class file {
    public static void main(String[] args) {
        int port = 6000; // Port number for file transfer
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server is running and waiting for a client...");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected!");

            // Receive file name and file data
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            String fileName = dis.readUTF(); // Read file name from client
            FileOutputStream fos = new FileOutputStream("received_" + fileName);

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = dis.read(buffer)) > 0) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("File received successfully: received_" + fileName);
            fos.close();
            dis.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
