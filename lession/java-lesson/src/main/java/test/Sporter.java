package test;

public class Sporter implements CanRun, CanSwim{

   public Sporter(){
        super();
    }

    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public void displayPlace(String place) {

    }

    @Override
    public void displayPlace() {

    }

    @Override
    public String getLunch() {
        return "Vista";
    }
}
