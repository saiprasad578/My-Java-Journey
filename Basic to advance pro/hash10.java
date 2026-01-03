import java.security.MessageDigest;

public class hash10{

    public static void main(String[] args) throws Exception {
        String password = "MyPassword123";

        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = md.digest(password.getBytes());

        StringBuilder hash = new StringBuilder();
        for (byte b : hashBytes) {
            hash.append(String.format("%02x", b));
        }

        System.out.println("Original Password: " + password);
        System.out.println("Hashed Password: " + hash);
    }
}
