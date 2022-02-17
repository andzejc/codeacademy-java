package inheritance;

import java.util.ArrayList;
import java.util.List;

public class AnimalManager extends Object {

    private final List<Animal> animals = new ArrayList<>();

    public void createAnimal() {
        animals.add(new Cat("cat"));
        animals.add(new Dog("dog"));

        getAnimals(Dog.class).forEach(System.out::println);
    }

    public List<Animal> getAnimals(Class<? extends Animal> clazz) {
        List<Animal> resultAnimals = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal.getClass() == clazz) {
                resultAnimals.add(animal);
            }
        }

        return resultAnimals;
    }
}
