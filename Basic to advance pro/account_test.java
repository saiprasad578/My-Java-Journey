class Account {

    // Private data member
    private int pin = 1234;

    // Getter method
    public int getPin() {
        return pin;
    }

    // Setter method
    public void setPin(int newPin) {
        pin = newPin;
    }
}

public class account_test {
    public static void main(String[] args) {

        Account a = new Account();

        System.out.println("Old PIN: " + a.getPin());

        a.setPin(5678);

        System.out.println("New PIN: " + a.getPin());
    }
}