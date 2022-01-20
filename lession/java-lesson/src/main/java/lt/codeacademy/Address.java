package lt.codeacademy;

public class Address {
    enum Country{
        LITHUANIA{ @Override public  String ReturnCountry(){return "LT";}},
        LATVIA{ @Override public  String ReturnCountry(){return "LV";}},
        ESTONIA{ @Override public  String ReturnCountry(){return "EE";}},
        POLAND{ @Override public  String ReturnCountry(){return "PL";}};
        public abstract String ReturnCountry();
    }
    private String city;
    private String street;
    private int houseNumber;
    private int flatNumber;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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
