package lt.codeacademy;

public class Main {
    public static void main(String[] args) {

        Address address = new Address(Country.LT, "Vilnius", "Subaciaus", 85, 50);
        address.showAddress();

        System.out.println("\n");

        Address address2 = new Address(Country.LV, "Riga", "Pobeda", 10, 1);
        address2.showAddress();

        System.out.println("\n");

        Address address3 = new Address(Country.EE, "Talin", "russia", 56, 5);
        address3.showAddress();

    }
}
