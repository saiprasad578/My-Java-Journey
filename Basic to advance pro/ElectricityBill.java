class ElectricityBill {

    private String customerName;
    private int units;

    ElectricityBill(String customerName, int units) {
        this.customerName = customerName;
        this.units = units;
    }

    void calculateBill() {
        double bill;

        if (units <= 100) {
            bill = units * 2;
        } else if (units <= 200) {
            bill = (100 * 2) + (units - 100) * 3;
        } else {
            bill = (100 * 2) + (100 * 3) + (units - 200) * 5;
        }

        System.out.println("Customer Name: " + customerName);
        System.out.println("Units Consumed: " + units);
        System.out.println("Electricity Bill: ₹" + bill);
    }
}

public class ElectricityBillDemo {

    public static void main(String[] args) {

        ElectricityBill customer =
                new ElectricityBill("Sai", 250);

        customer.calculateBill();
    }
}