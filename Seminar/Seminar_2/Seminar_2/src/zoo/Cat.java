package zoo;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }


    @Override
    public void speak() {
        // метод озвучивания каждого животного
        System.out.println("мяу-мяу");
    }
}
