package keypair;

import standard.model.Box;
import task1.model.Person;

public class KeyPairImpl {

    public static void init() {
        Pair<String, Integer> pair1 = new OrderedPair<>("Vienas", 1);
        Pair<String, String> pair2 = new OrderedPair<>("Vienas", "VIENAS");
        Pair<Integer, String> pair3 = new OrderedPair<>(1, "Vienas");

        System.out.println(pair1.getKey());

        Box<Person> boxPerson = new Box<>();
        Person person = new Person();
        person.setName("Petras");
        boxPerson.setObject(person);
        Pair<Integer, Box<Person>> pairBoxPerson = new OrderedPair<>(1, boxPerson);
        System.out.println(pairBoxPerson.getValue().getObject().getName());
    }
}
