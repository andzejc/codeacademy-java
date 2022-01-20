package lt.codeacademy;

public enum Country {
    LT, LV, EE, PL;

    public String showLocale() {
        switch (this) {
            case EE:
                return "ee";
            case LT:
                return "lt";
            case LV:
                return "lv";
            case PL:
                return "pl";
            default:
                return "";
        }
    }
}
