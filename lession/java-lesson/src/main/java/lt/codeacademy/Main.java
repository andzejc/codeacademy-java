package lt.codeacademy;

public class Main {
    public static void main(String[] args) {
        Adresas a1 = new Adresas(Salis.LIETUVA,"Vilnius", "Geležinio vilko", 26, 5);
        Adresas a2 = new Adresas(Salis.LIETUVA, "Kaunas", "Taikos prospektas", 40, 11);
        a1.showAddress();
        a2.showAddress();

    }
}
