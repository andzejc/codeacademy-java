package lt.codeacademy.model.employee.developers;

public class SeniorDeveloper extends Developer {

    public SeniorDeveloper(String name) {
        super(name);
    }

    @Override
    public boolean hasAccessForParking() {
        return true;
    }
}
