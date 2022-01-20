package lt.codeacademy;

import java.util.Date;

public class PeopleWithDriverLicense extends People {

    private Date validFrom;
    private Date validTo;
    private boolean haveCar;
    private String carBrand;

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

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    @Override
    public String toString() {
        return "PeopleWithDriverLicense{" +
                "validFrom=" + validFrom +
                ", validTo=" + validTo +
                ", haveCar=" + haveCar +
                ", carBrand='" + carBrand + '\'' +
                '}';
    }


}
