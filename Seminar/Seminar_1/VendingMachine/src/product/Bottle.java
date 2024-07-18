package product;

public class Bottle extends Product {   // class Bottle расширяет (extends) объект Product

    private double volume;

    public Bottle(String name, double price, double volume) {   // String name, double price - эти значения берутся из родительского класса; double volume - создается в этом методе
        super(name, price); // .super - вызов какого-либо поля или метод; super() - вызов конструктора родительского класса (в данном примере - класса Product)
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return super.toString() + ", volume: " + volume + "л.";
    }
}
