class GymMembership {

    private String memberName;
    private int months;
    private int feePerMonth;

    GymMembership(String memberName, int months, int feePerMonth) {
        this.memberName = memberName;
        this.months = months;
        this.feePerMonth = feePerMonth;
    }

    void displayDetails() {
        int totalFee = months * feePerMonth;

        System.out.println("Member Name: " + memberName);
        System.out.println("Membership Duration: " + months + " months");
        System.out.println("Monthly Fee: ₹" + feePerMonth);
        System.out.println("Total Fee: ₹" + totalFee);

        if (months >= 12) {
            System.out.println("Membership Type: Annual");
        } else {
            System.out.println("Membership Type: Regular");
        }
    }
}

public class GymDemo {

    public static void main(String[] args) {

        GymMembership member = new GymMembership("Sai", 12, 800);

        member.displayDetails();
    }
}