class method {
    public int add (int a,int b){
        return a+b;
    }
    public int add (int a , int b , int c){
        return a+b+c;
    }
    public float add (float a , float b){
        return a+b;
    }
}
class test {
    public static void main (String[] args) {
        method m = new method();
        System.out.println("Sum of two integers: " + m.add(10, 20));
        System.out.println("Sum of three integers: " + m.add(10, 20, 30));
        System.out.println("Sum of two floats: " + m.add(10.5f, 20.5f));
    
    }
}