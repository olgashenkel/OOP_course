public class Point2D {
    private int x, y; // privat закрывает данные как на чтение, так и на запись,
                    // чтобы открыть доступ на чтение, необходимо прописать отдельный метод
                    // создать метод get и set для чтения и записи

    public Point2D(int valueX, int valueY) {
        x = valueX;
        y = valueY;
    }
    // ctor
    // get; set;
    // docs
//    public Point2D() {
//        x = 0;
//        y = 0;
//    }
//
//    public Point2D(int value) {
//        x = value;
//        y = value;
//    }


    public Point2D(int value) {
        this(value, value);
    }

    public Point2D() {
        this(0);
    }

    public String getInfo() {
        return String.format("x: %d; y: %d", x, y);
    }

    @Override
    public String toString() {
        return getInfo();
    }
}
