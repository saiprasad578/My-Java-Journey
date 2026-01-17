public class charhash {
    public static void main(String[] args) {
        char ch = 'A';

        int hash = (int) ch;

        System.out.println("Character: " + ch);
        System.out.println("Hash Value: " + hash);
        System.out.println("Hash Value (Hex): " + Integer.toHexString(hash));
        
    }
}
