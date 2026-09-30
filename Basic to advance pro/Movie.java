class Movie {

    String name;
    int tickets;
    double price;

    Movie(String name, int tickets, double price) {
        this.name = name;
        this.tickets = tickets;
        this.price = price;
    }

    void showDetails() {
        System.out.println("Movie: " + name);
        System.out.println("Tickets: " + tickets);
        System.out.println("Price per ticket: ₹" + price);
    }

    void calculateBill() {
        double total = tickets * price;
        System.out.println("Total Bill: ₹" + total);
    }
}

public class MovieBooking {

    public static void main(String[] args) {

        Movie movie =
                new Movie("Avengers", 3, 250);

        movie.showDetails();

        System.out.println();

        movie.calculateBill();
    }
}