package lt.codeacademy;

public class LegacyStudent implements Comparable {
    private String name;

    @Override
    public int compareTo(Object o) {
        LegacyStudent s = (LegacyStudent) o;
        return name.compareTo(s.name);
    }
}
