package lt.codeacademy;

public class Address {
    private String town;
    private String street;
    private int houseNumber;
    private int flatNumber;
    private Country country;

    Address(Country country, String town, String street, int houseNumber, int flatNumber) {
        this.town = town;
        this.street = street;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
        this.country = country;
    }

    public void showAddress() {
        System.out.print("Country: " + this.country.showLocale() + "\n");
        System.out.print("Town: " + this.town + "\n");
        System.out.print("Street: " + this.street + "\n");
        System.out.print("House No: " + this.houseNumber + "\n");
        System.out.print("Flat No: " + this.flatNumber);
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
    }

}
