package lt.codeacademy;

public enum Country {
    LT("Lithuania"),LV("Latvia"),EE("Estonia"),PL("Poland");

    private final String country;
    Country(String country){
        this.country = country;
    }
    public String showLocale() {
        return country;
    }
}
