package lt.codeacademy;


public class Main {
    public static void main(String[] args) {
        Country country = Country.LITHUANIA;


        Adresas countryOne = new Adresas();
        countryOne.setMiestas("Klaipėda");
        countryOne.setGatve("Minijos gatvė");
        countryOne.setNamoNumeris(5);
        countryOne.setButoNumeris(12);


        System.out.println(country + countryOne.getMiestas() + countryOne.getGatve() + countryOne.getNamoNumeris() + countryOne.getButoNumeris());
    }
}
