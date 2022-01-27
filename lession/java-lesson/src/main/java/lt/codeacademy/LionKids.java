package lt.codeacademy;

public class LionKids  extends Lion{
    @Override
    public String getName() {
        return null;
    }

    @Override
    public boolean isPet() {  // negali buti private
        return false;
    }

    @Override
    public void newMethod() {
        a = 50;
    }
}
