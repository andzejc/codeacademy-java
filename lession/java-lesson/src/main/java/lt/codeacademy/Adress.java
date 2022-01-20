package lt.codeacademy;

import java.util.Scanner;

public class Adress {
    private String miestas;
    private String gatve;
    private int namoNumeris;

    public Adress() {
    }

    public Adress(String miestas, String gatve, int namoNumeris) {
        this.miestas = miestas;
        this.gatve = gatve;
        this.namoNumeris = namoNumeris;
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

    public void setNamoNumeris(int namoNumeris) {
        this.namoNumeris = namoNumeris;
    }
    public void showAdress(){
        System.out.printf("Jusu miestas yra : %10s. \nGatve: %10s.\nNamo numeris %4s.",miestas,gatve,namoNumeris);
    }
    public void setInfo(String miestas, String gatve, int namoNumeris){
        Scanner sc = new Scanner(System.in);

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
