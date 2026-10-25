class Datausage {

    private String userName;
    private double totalData;
    private double usedData;

    DataUsage(String userName, double totalData, double usedData) {
        this.userName = userName;
        this.totalData = totalData;
        this.usedData = usedData;
    }

    void checkUsage() {
        double remainingData = totalData - usedData;

        System.out.println("User Name: " + userName);
        System.out.println("Total Data: " + totalData + " GB");
        System.out.println("Used Data: " + usedData + " GB");
        System.out.println("Remaining Data: " + remainingData + " GB");

        if (remainingData <= 1) {
            System.out.println("Warning: Data is almost over!");
        } else {
            System.out.println("Data is sufficient.");
        }
    }
}

public class DataUsageDemo {

    public static void main(String[] args) {

        DataUsage user = new DataUsage("Sai", 2.0, 1.5);

        user.checkUsage();
    }
}