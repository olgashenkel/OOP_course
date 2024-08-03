package Calc;

public class Program {
    public static void main(String[] args) {

//        // расширенная запись:
//        var m = new SumModel();
//        var v = new View();
//        Presenter p = new Presenter(m, v);
//        p.buttonClick();

        // сокращенная запись:
        Presenter p = new Presenter(new SumModel(), new View());
        p.buttonClick();

        p.buttonClick();
        p.buttonClick();
        p.buttonClick();
    }
}
