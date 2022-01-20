package lt.codeacademy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Adress adresas = new Adress("Vilnius","Gedimino",25);

        Adress adresas2 = new Adress();
        adresas2.setInfo();
        adresas2.showAdress();
        System.out.println("------------");
        adresas.showAdress();


    }
}
