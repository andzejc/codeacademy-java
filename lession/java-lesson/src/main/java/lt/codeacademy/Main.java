package lt.codeacademy;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<FullAddress> fullAddresses = new ArrayList<>();
        String countryCode = Countries.LITHUANIA.showLocale();
        Address address = new Address("Vilnius", "Kalvariju", 255, 19);
        fullAddresses.add(new FullAddress(countryCode,address));
        String countryCode1 = Countries.LATVIA.showLocale();
        Address address1 = new Address("Riga", "Aristida Briāna", 10, 1);
        fullAddresses.add(new FullAddress(countryCode1,address1));
        String countryCode2 = Countries.ESTONIA.showLocale();
        Address address2 = new Address("Tallinn", "Räägu", 27, 14);
        fullAddresses.add(new FullAddress(countryCode2,address2));
        String countryCode3 = Countries.POLAND.showLocale();
        Address address3 = new Address("Warsaw", "Domaniewska", 44, 672);
        fullAddresses.add(new FullAddress(countryCode3,address3));
        fullAddresses.forEach(fullAddress -> showAddress(fullAddress.getCountryCode(),fullAddress.getAddress()));
    }

    private static void showAddress(String countryCode, Address address) {
        System.out.println(countryCode + " " + address.toString());
    }
}