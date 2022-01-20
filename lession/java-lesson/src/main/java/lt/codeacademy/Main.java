package lt.codeacademy;

public class Main {
    public static void main(String[] args) {

        Adress adress1 = new Adress("Vilnius", "Kareiviu", 23, 15, Country.LT);
        Adress adress2 = new Adress("Poznań", "Matyi", 2, 30, Country.PL);
        Adress adress3 = new Adress("Daugavpils", "Liginišķu iela", 50, 1, Country.LV);

        System.out.println(adress1.showAdderess());
        System.out.println(adress2.showAdderess());
        System.out.println(adress3.showAdderess());
    }
}
