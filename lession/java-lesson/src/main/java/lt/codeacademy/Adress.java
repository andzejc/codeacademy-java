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
        System.out.printf("Jusu miestas yra : %10s. \nGatve: %10s.\nNamo numeris %4s.\n",miestas,gatve,namoNumeris);
    }
    public void setInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite miesta: ");
        this.miestas = sc.nextLine();
        System.out.println("Iveskite gatve: ");
        this.gatve = sc.nextLine();
        System.out.println("Iveskite namo numeri: ");
        this.namoNumeris = sc.nextInt();
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
