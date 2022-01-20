package lt.codeacademy;

public class Adresas {
    private Salis salis;
    private String miestas;
    private String gatve;
    private int namoNumeris;
    private int butoNumeris;

    public Adresas(Salis salis, String miestas, String gatve, int namoNumeris, int butoNumeris){
        this.salis = salis;
        this.miestas = miestas;
        this.gatve = gatve;
        this.namoNumeris = namoNumeris;
        this.butoNumeris = butoNumeris;
    }

    public void showAddress(){
        System.out.printf("Salis: %s, Miestas: %s, gatve: %s, namo numeris: %d, buto numeris: %d\n",salis.showLocale(), miestas, gatve, namoNumeris, butoNumeris);
    }

    public String getMiestas() {
        return miestas;
    }

    public void setMiestas(String miestas) {
        this.miestas = miestas;
    }

    public String getGatve() {
        return gatve;
    }

    public void setGatve(String gatve) {
        this.gatve = gatve;
    }

    public int getNamoNumeris() {
        return namoNumeris;
    }

    public Salis getSalis() {
        return salis;
    }

    public void setSalis(Salis salis) {
        this.salis = salis;
    }

    public void setNamoNumeris(int namoNumeris) {
        this.namoNumeris = namoNumeris;
    }

    public int getButoNumeris() {
        return butoNumeris;
    }

    public void setButoNumeris(int butoNumeris) {
        this.butoNumeris = butoNumeris;
    }
}
