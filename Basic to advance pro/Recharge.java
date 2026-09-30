class Recharge {

    String mobileNumber;
    double amount;
    String plan;

    Recharge(String mobileNumber, double amount, String plan) {
        this.mobileNumber = mobileNumber;
        this.amount = amount;
        this.plan = plan;
    }

    void showDetails() {
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Plan: " + plan);
        System.out.println("Amount: ₹" + amount);
    }

    void recharge() {
        System.out.println("Recharge successful!");
    }
}

public class MobileRecharge {

    public static void main(String[] args) {

        Recharge r =
                new Recharge("9876543210", 299, "1.5GB/day");

        r.showDetails();

        System.out.println();

        r.recharge();
    }
}