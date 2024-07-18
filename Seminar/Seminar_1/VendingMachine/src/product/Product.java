package product;// который предназначается для первичной установки значений полей объекта.
// Конструктор создает своеобразный “каркас” класса, которому каждый новый объект класса должен соответствовать.
//
// Дело в том, что у каждого класса в Java есть так называемый конструктор по умолчанию.
//У него нет никаких аргументов, но он срабатывает каждый раз при создании любого объекта любого класса.

// Конструктор по умолчанию всегда незримо присутствует в твоих классах.
//Дефолтный конструктор исчезает из класса, когда ты создаешь какой-то конструктор с аргументами.

// Если в обычном методе первый оператор может быть любым, то у конструктора гораздо меньше свободы.
// Первым оператором конструктора должен быть либо явный вызов другого конструктора того же класса,
// либо явный или неявный вызов конструктора родительского класса. Явный вызов конструкторов того же класса осуществляется
// с помощью ключевого слова this за которым следует набор аргументов заключённый в скобки.
// Явный вызов конструктора родительского класса производится точно так же, но при этом используется ключевое слово super.
// В аргументах явного вызова конструктора того же, либо родительского класса нельзя обращаться к полям и методам объекта,
// равно как и использовать ключевые слова this и super, так как явный вызов конструктора вводит статический контекст.
// Для неявного вызова конструктора родительского класса писать ничего не надо, но при этом неявно вызывается
// конструктор по-умолчанию, который должен существовать и быть видимым для текущего класса. При этом, следует иметь ввиду,
// что если цепочка вызова родительских конструкторов прервётся до того как конструктор класса Object,
// находящийся на вершине цепочки, успешно завершит свою работу, то объект не будет финализируемым,
// то есть метод finalize() такого объекта никогда вызван не будет.
//
//После завершения работы конструктора родительского класса, управление неявно передаётся на блоки
// инициализаторов экземпляра и инициализаторы полей экземпляра текущего класса. Инициализаторы исполняются в том порядке,
// в каком они встречаются в тексте программы. Лишь после завершения работы инициализаторов управление передаётся оставшейся части конструктора.

public class Product {

    // у класса поля почти всегда privat, чтобы не было возможности нарушить принцип инкапсуляции
    // privat - модификатор доступа, к-ый означает, что поле либо метод доступны в рамках текущего класса
    // при попытке вызвать
    private String name;
    private double price;

//    private final double price;
    //Ключевое слово final означает завершенный и может быть использовано для объявления переменных, методов и классов.
    //Переменная может быть объявлено как final, что позволяет предотвратить изменение содержимого переменной, сделав ее, по существу, константой.
    //final переменная класса, объявленная как не static, должна инициализироваться при объявлении или в теле конструктора или блоке инициализации, иначе произойдет ошибка компиляции.
    //
    //Кроме переменных, объявленными как final могут быть параметры метода и локальные переменные.
    // final переменные, объявленные как static, должны быть проинициализированы при объявлении или в блоке инициализации,
    // также объявленном как static. В противном случае опять получится ошибка компиляции


    public Product(String name, double price) {     // !!! У этого метода нет возвращаемого значения (даже void), так как идея конструктора - возвращать объект классам
        // Метод-конструктор - это единственный метод, который пишется с заглавной буквы!!!
        this.name = name;
        this.price = price;
    }

    // Если требуется создать ещё один конструктор без аргументов:


//    public product.Product() {  // Дефолтный конструктор
//        // Процесс перегрузки - когда создается несколько методов с одинаковым названием
//        // Следует учитывать, что перегрузка методов требует содержать РАЗНОЕ ЗНАЧЕНИЕ АРГУМЕНТОВ!
//    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public double getPrice() {
        return price;
    }

//    public void setPrice(double price) {
//        this.price = price;
//    }


    @Override
    // - это аннотация (функциональный комментарий).
    // @Override — аннотация-маркер, которая может применяться только к методам.
    // Метод, аннотированный как @Override, должен переопределять метод супер класса.
    // @Override — проверяет, переопределён ли метод.
    public String toString() {
        return "name: " + name + ", price: " + price + "p.";
    }


}