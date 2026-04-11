package homework.animal;

public class Main {
    public static void main(String[] args) {

        AnimalCollection collection = new AnimalCollection();

        collection.addAnimal("Кот");
        collection.addAnimal("Собака");
        collection.addAnimal("Хомяк");

        System.out.println("После добавления: " + collection.getAnimals());

        String removed = collection.removeAnimal();
        System.out.println("Удалено: " + removed);
        System.out.println("После удаления: " + collection.getAnimals());
    }
}