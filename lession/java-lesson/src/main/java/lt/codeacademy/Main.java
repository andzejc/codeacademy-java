package lt.codeacademy;

public class Main {
    public static void main(String[] args) {

        //tirkinam showLocale()

        Salis salis = Salis.EE;
        System.out.println(salis.showLocale());


        // kuriam a1
        Adresas a1 = new Adresas(Salis.LT, "Klaipeda", "H. Manto", 6, 6);

        // kuriam a2
        Adresas a2 = new Adresas();

        //setinam a2
        a2.setButoNr(5);
        a2.setGatve("LOL");
        a2.setMiestas("Ryga");
        a2.setNamoNr(3);
        a2.setSalis(Salis.LV);

        //tirkinam showAddres()
        System.out.println("-------- Pirmas adresas ------- \n");
        System.out.println(a1.showAddress());
        System.out.println("-------- Antras adresas ------- \n");
        System.out.println(a2.showAddress());


    }


}
