import java.util.Scanner;

class Bus {

    String passengerName;
    int age;
    double ticketPrice;

    Bus(String passengerName, int age, double ticketPrice) {
        this.passengerName = passengerName;
        this.age = age;
        this.ticketPrice = ticketPrice;
    }

    void showTicket() {
        System.out.println("Passenger: " + passengerName);
        System.out.println("Age: " + age);
        System.out.println("Ticket Price: ₹" + ticketPrice);
    }

    void bookTicket() {
        System.out.println("Ticket booked successfully!");
    }
}

public class BusTicket {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter passenger name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        Bus ticket = new Bus(name, age, 500);

        System.out.println();

        ticket.showTicket();
        ticket.bookTicket();

        sc.close();
    }
}