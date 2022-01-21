package lt.codeacademy;

public enum Countries {
    LITHUANIA("LT"), LATVIA("LV"), ESTONIA("EE"), POLAND("PL");
    private final String countryCode;
    private Countries(String countryCode){
        this.countryCode = countryCode;
    }
    public String showLocale(){
        return this.countryCode;
    }
}
