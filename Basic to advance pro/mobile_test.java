class mobile {

    
    private String model;
    private int price;

    public void setModel(String m) {
        model = m;
    }

    public void setPrice(int p) {
        price = p;
    }


    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }
}

public class mobile_test {
    public static void main(String[] args) {

        mobile m1 = new mobile();

        m1.setModel("Samsung");
        m1.setPrice(25000);

        System.out.println("Mobile Model: " + m1.getModel());
        System.out.println("Mobile Price: " + m1.getPrice());
    }
}