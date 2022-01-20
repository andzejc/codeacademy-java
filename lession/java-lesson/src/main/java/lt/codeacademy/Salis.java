package lt.codeacademy;

public enum Salis {
    LIETUVA("LT"), LATVIJA("LV"), ESTIJA("EE"), LENKIJA("PL");

    private String locale;

    private Salis(String locale){
        this.locale = locale;
    }

    public String showLocale(){
        return locale;
    }
}
