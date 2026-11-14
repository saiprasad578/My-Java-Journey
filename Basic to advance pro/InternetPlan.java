class InternetPlan {

    private String customerName;
    private String planName;
    private int monthlyFee;
    private int dataLimit;
    private int dataUsed;

    InternetPlan(String customerName, String planName,
                 int monthlyFee, int dataLimit) {
        this.customerName = customerName;
        this.planName = planName;
        this.monthlyFee = monthlyFee;
        this.dataLimit = dataLimit;
        this.dataUsed = 0;
    }

    void useData(int data) {
        if (data > 0) {
            dataUsed = dataUsed + data;
            System.out.println(data + " GB data used.");
        } else {
            System.out.println("Invalid data amount.");
        }
    }

    void displayDetails() {
        System.out.println("Customer: " + customerName);
        System.out.println("Plan: " + planName);
        System.out.println("Monthly Fee: Rs." + monthlyFee);
        System.out.println("Data Used: " + dataUsed + " GB");
        System.out.println("Remaining Data: "
                + (dataLimit - dataUsed) + " GB");

        if (dataUsed >= dataLimit) {
            System.out.println("Status: Data limit reached.");
        } else {
            System.out.println("Status: Plan Active.");
        }
    }
}

public class InternetPlanDemo {

    public static void main(String[] args) {

        InternetPlan plan =
                new InternetPlan("Sai", "Fiber 100", 799, 100);

        plan.displayDetails();

        System.out.println();

        plan.useData(35);
        plan.useData(40);

        System.out.println();

        plan.displayDetails();
    }
}