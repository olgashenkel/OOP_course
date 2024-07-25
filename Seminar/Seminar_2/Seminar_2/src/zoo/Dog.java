package zoo;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        // метод озвучивания каждого животного
        System.out.println("гав-гав");
    }
}
