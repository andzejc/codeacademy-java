package lt.codeacademy;

/**
 * Klasė Adresas visi laukai turi būti private ir tureti geterius ir seterius:
 *
 * Šalis turi but enum su metodu showLocale (LT, LV, EE, PL).
 * Miestas.
 * Gatvė.
 * Namo numeris.
 * Buto numeris.
 * Išspausdina informaciją showAdderess();
 * Sukurti kelete objektu per construktoriu Main metode ir atprintiti tuos Objektus print line
 */
public class Address {
    private Country country;
    private String city;
    private String street;
    private int buildingNr;
    private int appartmentNr;

    public Address() {
    }

    public Address(Country country, String city, String street, int buildingNr, int appartmentNr) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.buildingNr = buildingNr;
        this.appartmentNr = appartmentNr;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

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

    public int getBuildingNr() {
        return buildingNr;
    }

    public void setBuildingNr(int buildingNr) {
        this.buildingNr = buildingNr;
    }

    public int getAppartmetnNr() {
        return appartmentNr;
    }

    public void setAppartmetnNr(int appartmetnNr) {
        this.appartmentNr = appartmetnNr;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country=" + country +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", buildingNr=" + buildingNr +
                ", appartmetnNr=" + appartmentNr +
                '}';
    }
}
