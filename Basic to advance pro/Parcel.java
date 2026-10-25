class Parcel {

    private String trackingId;
    private String receiverName;
    private String status;

    Parcel(String trackingId, String receiverName) {
        this.trackingId = trackingId;
        this.receiverName = receiverName;
        this.status = "Parcel Booked";
    }

    void updateStatus(String newStatus) {
        status = newStatus;
        System.out.println("Parcel status updated!");
    }

    void displayDetails() {
        System.out.println("Tracking ID: " + trackingId);
        System.out.println("Receiver Name: " + receiverName);
        System.out.println("Current Status: " + status);
    }
}

public class ParcelDemo {

    public static void main(String[] args) {

        Parcel parcel = new Parcel("PK101", "Sai");

        parcel.displayDetails();

        System.out.println();

        parcel.updateStatus("Out for Delivery");

        parcel.displayDetails();
    }
}