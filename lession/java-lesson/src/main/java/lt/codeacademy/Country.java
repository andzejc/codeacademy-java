package lt.codeacademy;

public enum Country {
    LITHUANIA("LT"), ESTONIA("ES"), LATVIA("LV"), POLAND("PL");
    private final String local;

    Country(String local) {
        this.local = local;
    }

    public String showLocal() {
        return local;
    }

}
