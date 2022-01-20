package lt.codeacademy;

public class Adresas {
    private String miestas;
    private String gatve;
    private int namoNumeris;
    private int butoNumeris;

    public Adresas(String miestas, String gatve, int namoNumeris, int butoNumeris){
        this.miestas = miestas;
        this.gatve = gatve;
        this.namoNumeris = namoNumeris;
        this.butoNumeris = butoNumeris;
    }

    public void showAddress(){
        System.out.printf("Miestas: %s, gatve: %s, namo numeris: %d, buto numeris: %d\n", miestas, gatve, namoNumeris, butoNumeris);
    }
}
