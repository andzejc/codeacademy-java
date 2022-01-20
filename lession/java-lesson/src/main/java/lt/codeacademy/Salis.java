package lt.codeacademy;

public enum Salis {
    LITHUANIA("LT"), ESTONIA("ES"), LATVIA("LV"), POLAND("PL"), GERMANY("DE"), UNITED_KINGDOM("UK");
    public String location;

Salis(String location){
 this.location = location;
}
    public String showLocation() {
        return location;
    }


    }
