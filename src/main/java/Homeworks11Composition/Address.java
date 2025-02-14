package Homeworks11Composition;

public class Address {
    private String street;
    private String city;
    private String zip;
    private State state;

    public Address(String street, String city, String zip, State state) {
        this.street = street;
        this.city = city;
        this.zip = zip;
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Anna address is "+ street+", "+city+", "+zip+", "+state;
    }
}
