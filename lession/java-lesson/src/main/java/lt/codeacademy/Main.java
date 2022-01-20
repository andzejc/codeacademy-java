package lt.codeacademy;

import java.util.Random;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Address address = new Address(Country.ESTONIA,
                "Tallinn", "Old Tallinn Street", 12, 32);

        System.out.println(address);
        System.out.println(address.getCountry().showLocal());
        System.out.println();

        Stream.generate(Main::generateAddress).limit(10).forEach(a -> {
            System.out.println(a);
            System.out.println(a.getCountry().showLocal());
            System.out.println();
        });
    }

    public static Address generateAddress() {
        Random r = new Random();

        String[] city = {"Aberdeen", "Abilene", "Akron", "Albany", "Albuquerque", "Alexandria",
                "Allentown", "Amarillo", "Anaheim", "Anchorage", "Ann Arbor", "Antioch", "Apple Valley"};

        String[] street = {"Tower Boulevard", "King Passage", "Emerald Street", "Snowflake Lane", "Forest Boulevard",
                "Orchard Passage", "Oceanview Avenue", "Law Way", "Ruby Lane", "Lower Way"};

        Country[] countries = Country.values();

        return new Address(countries[r.nextInt(countries.length)],
                city[r.nextInt(city.length)],
                street[r.nextInt(street.length)],
                r.nextInt(100) + 1,
                r.nextInt(100) + 1);
    }


}