package lt.codeacademy;

public class Lion extends NewAnimal{

    int a;
    int b = 20;

    private void lionMethod() {

    }

    @Override
    public String getName() {
        return "New name";
    }

    @Override
    protected boolean isPet() {
        return false;
    }

    @Override
    public void newMethod() {
        Lion animal = new Lion();
    }


//    public abstract boolean isSleaping(); doesn't compiele

}
