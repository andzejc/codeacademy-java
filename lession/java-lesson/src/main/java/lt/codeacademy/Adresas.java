package lt.codeacademy;

public class Adresas {
    private Enum salis;
    private String miestas;
    private String gatve;
    private int namoNr;
    private int butoNr;

    public Adresas() {
    }

    Adresas(Enum salis, String miestas, String gatve, int namoNr, int butoNr) {
        this.salis = salis;
        this.miestas = miestas;
        this.gatve = gatve;
        this.namoNr = namoNr;
        this.butoNr = butoNr;
    }

    public Enum getSalis() {
        return salis;
    }

    public void setSalis(Enum salis) {
        this.salis = salis;
    }

    public int getNamoNr() {
        return namoNr;
    }

    public void setNamoNr(int namoNr) {
        this.namoNr = namoNr;
    }
// seters/getters

    public String getGatve() {
        return gatve;
    }

    public void setGatve(String gatve) {
        this.gatve = gatve;
    }

    public int getButoNr() {
        return butoNr;
    }

    public void setButoNr(int butoNr) {
        this.butoNr = butoNr;
    }

    public String getMiestas() {
        return miestas;
    }

    public void setMiestas(String miestas) {
        this.miestas = miestas;
    }


    //Methods
    public String showAddress() {

        return "Miestas --> " + this.miestas + "\n" +
                "Gatve  --> " + this.gatve + "\n" +
                "Namo_nr --> " + this.namoNr + "\n" +
                "Buto_NR --> " + this.butoNr + "\n";
    }


}
