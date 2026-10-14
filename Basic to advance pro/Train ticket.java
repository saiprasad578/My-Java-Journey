class Train ticket {

    private String passengerName;
    private String trainName;
    private int seats;
    private int pricePerSeat;

    TrainTicket(String passengerName, String trainName, int seats, int pricePerSeat) {
        this.passengerName = passengerName;
        this.trainName = trainName;
        this.seats = seats;
        this.pricePerSeat = pricePerSeat;
    }

    void displayTicket() {
        int totalPrice = seats * pricePerSeat;

        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Train Name: " + trainName);
        System.out.println("Seats Booked: " + seats);
        System.out.println("Total Ticket Price: ₹" + totalPrice);
    }
}

public class TrainTicketDemo {

    public static void main(String[] args) {

        TrainTicket ticket = new TrainTicket("Sai", "Vande Bharat", 2, 500);

        ticket.displayTicket();
    }
}