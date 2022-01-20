package lt.codeacademy;

import java.util.Date;

public class PeopleWithDriverLicense extends People{

    private Date validFrom;
    private Date validTo;
    private boolean haveCar;

    public Date getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }

    public Date getValidTo() {
        return validTo;
    }

    public void setValidTo(Date validTo) {
        this.validTo = validTo;
    }

    public boolean isHaveCar() {
        return haveCar;
    }

    public void setHaveCar(boolean haveCar) {
        this.haveCar = haveCar;
    }

    @Override
    public String toString() {
        return "PeopleWithDriverLicense{" +
                "validFrom=" + validFrom +
                ", validTo=" + validTo +
                ", haveCar=" + haveCar +
                '}';
    }
}
