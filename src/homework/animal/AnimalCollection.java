package homework.animal;

import java.util.LinkedList;
import java.util.List;

public class AnimalCollection {
    private final List<String> animals = new LinkedList<>();

    public void addAnimal(String animal) {
        animals.add(0, animal);
    }

    public String removeAnimal() {
        if (animals.isEmpty()) {
            throw new java.util.NoSuchElementException("Коллекция пуста");
        }
        return animals.remove(animals.size() - 1);
    }

    public List<String> getAnimals() {
        return animals;
    }
}