public class BytePacker {
    
    public static short packBytes(int byte1, int byte2) {
        
        return (short) ((byte1 << 8) | byte2);
    }

    public static void main(String[] args) {
        
        System.out.println(packBytes(1, 2)); 
    }
}