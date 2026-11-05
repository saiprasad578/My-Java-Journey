class job {

    private String employeeName;
    private int availableLeaves;
    private String leaveStatus;

    Employee(String employeeName, int availableLeaves) {
        this.employeeName = employeeName;
        this.availableLeaves = availableLeaves;
        this.leaveStatus = "No Leave Requested";
    }

    void applyLeave(int days) {
        if (days > 0 && days <= availableLeaves) {
            availableLeaves = availableLeaves - days;
            leaveStatus = "Leave Approved";

            System.out.println("Leave approved successfully!");
            System.out.println("Approved Leave Days: " + days);
        } else {
            leaveStatus = "Leave Rejected";
            System.out.println("Insufficient leave balance!");
        }
    }

    void displayDetails() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Available Leaves: " + availableLeaves);
        System.out.println("Leave Status: " + leaveStatus);
    }
}

public class LeaveManagementDemo {

    public static void main(String[] args) {

        Employee employee = new Employee("Sai", 15);

        employee.displayDetails();

        System.out.println();

        employee.applyLeave(5);

        System.out.println();

        employee.displayDetails();
    }
}