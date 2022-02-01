package test;

public class Runner implements CanRun, D {
    @Override
    public int getSpeed() {
        return 100;
    }

    @Override
    public void displayPlace() {

    }

    @Override
    public String getLunch() {
        return null;
    }

    @Override
    public int getRequiredFoodAmount() {
        return 15;
    }
}
