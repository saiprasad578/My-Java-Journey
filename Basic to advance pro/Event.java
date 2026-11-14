class Event {

    private String eventName;
    private int totalSeats;
    private int registeredSeats;

    Event(String eventName, int totalSeats) {
        this.eventName = eventName;
        this.totalSeats = totalSeats;
        this.registeredSeats = 0;
    }

    void registerParticipant() {
        if (registeredSeats < totalSeats) {
            registeredSeats++;
            System.out.println("Registration successful!");
        } else {
            System.out.println("Sorry, all seats are booked.");
        }
    }

    void displayDetails() {
        System.out.println("Event Name: " + eventName);
        System.out.println("Total Seats: " + totalSeats);
        System.out.println("Registered Participants: " + registeredSeats);
        System.out.println("Available Seats: "
                + (totalSeats - registeredSeats));
    }
}

public class EventDemo {

    public static void main(String[] args) {

        Event event = new Event("Java Workshop", 3);

        event.displayDetails();

        System.out.println();

        event.registerParticipant();
        event.registerParticipant();
        event.registerParticipant();
        event.registerParticipant();

        System.out.println();

        event.displayDetails();
    }
}