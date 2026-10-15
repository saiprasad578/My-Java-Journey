class HotelRoom {

    private String customerName;
    private int days;
    private int pricePerDay;

    HotelRoom(String customerName, int days, int pricePerDay) {
        this.customerName = customerName;
        this.days = days;
        this.pricePerDay = pricePerDay;
    }

    void bookRoom() {
        int totalAmount = days * pricePerDay;

        System.out.println("Customer Name: " + customerName);
        System.out.println("Days Stayed: " + days);
        System.out.println("Price Per Day: ₹" + pricePerDay);
        System.out.println("Total Amount: ₹" + totalAmount);
    }
}

public class HotelBookingDemo {

    public static void main(String[] args) {

        HotelRoom booking = new HotelRoom("Sai", 3, 1500);

        booking.bookRoom();
    }
}