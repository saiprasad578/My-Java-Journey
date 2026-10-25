class BloodDonor {

    private String donorName;
    private String bloodGroup;
    private int age;
    private boolean available;

    BloodDonor(String donorName, String bloodGroup, int age) {
        this.donorName = donorName;
        this.bloodGroup = bloodGroup;
        this.age = age;
        this.available = true;
    }

    void checkAvailability() {
        System.out.println("Donor Name: " + donorName);
        System.out.println("Blood Group: " + bloodGroup);
        System.out.println("Age: " + age);

        if (age >= 18 && age <= 65 && available) {
            System.out.println("Status: Available for screening");
        } else {
            System.out.println("Status: Not currently eligible");
        }
    }

    void donateBlood() {
        if (age >= 18 && age <= 65 && available) {
            available = false;
            System.out.println("Donation recorded successfully.");
        } else {
            System.out.println("Donation cannot be recorded.");
        }
    }
}

public class BloodDonorDemo {

    public static void main(String[] args) {

        BloodDonor donor =
                new BloodDonor("Sai", "O+", 21);

        donor.checkAvailability();

        System.out.println();

        donor.donateBlood();

        System.out.println();

        donor.checkAvailability();
    }
}