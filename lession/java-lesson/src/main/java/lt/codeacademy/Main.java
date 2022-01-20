package lt.codeacademy;

public class Main {

    public static void main(String[] args) {
        Address address1 = new Address(Country.LT, "Vilnius", "verkiu", 1, 3);
        Address address2 = new Address(Country.LV, "Ryga", "centras", 2, 5);
        showAddress(address1);
        showAddress(address2);
    }
    
    public static void showAddress(Address address) {
        System.out.println(address);
    }
}
