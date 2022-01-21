package lt.codeacademy;

public class FullAddress {
    private String countryCode;
    private Address address;

    public FullAddress(String countryCode, Address address){
        this.countryCode = countryCode;
        this.address = address;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
