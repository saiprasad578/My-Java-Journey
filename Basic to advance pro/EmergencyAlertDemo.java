class EmergencyAlert {

    private String location;
    private String emergencyType;
    private int priority;
    private String status;

    EmergencyAlert(String location, String emergencyType, int priority) {
        this.location = location;
        this.emergencyType = emergencyType;
        this.priority = priority;
        this.status = "Pending";
    }

    void displayAlert() {
        System.out.println("Location: " + location);
        System.out.println("Emergency Type: " + emergencyType);
        System.out.println("Priority: " + priority);
        System.out.println("Status: " + status);
    }

    void updateStatus(String newStatus) {
        status = newStatus;
        System.out.println("Alert status updated.");
    }
}

public class EmergencyAlertDemo {

    public static void main(String[] args) {

        EmergencyAlert alert =
                new EmergencyAlert("Warangal", "Fire", 1);

        alert.displayAlert();

        System.out.println();

        alert.updateStatus("Help Dispatched");

        System.out.println();

        alert.displayAlert();
    }
}