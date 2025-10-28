public class address {
    String street;
    String city;
    String state;
    String zipCode;

    public address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getFullAddress() {
        return street + ", " + city + ", " + state + " " + zipCode;
    }
}