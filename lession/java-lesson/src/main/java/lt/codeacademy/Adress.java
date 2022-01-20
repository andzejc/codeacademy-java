package lt.codeacademy;

public class Adress {
    private String miestas;
    private String gatve;
    private int namoNumeris;

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

    public void setNamoNumeris(int namoNumeris) {
        this.namoNumeris = namoNumeris;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "miestas='" + miestas + '\'' +
                ", gatve='" + gatve + '\'' +
                ", namoNumeris=" + namoNumeris +
                '}';
    }
}
