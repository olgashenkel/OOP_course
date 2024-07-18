import product.Bottle;
import product.Product;
import vending.VendingMashine;

public class Main {

    public static void main(String[] args) {

        VendingMashine vendingMashine = new VendingMashine();  // создаем торговый автомат


        Product product1 = new Product("twix", 100);
        Product product2 = new Bottle("coca-cola", 110, 2); // можно записать так, в зависимости от выбора типа (в данном случае Bottle или Product), зависит выбор доступных методов
//        Bottle product2 = new Bottle("coca-cola", 110, 2); // а можно записать так, в зависимости от выбора типа (в данном случае Bottle или Product), зависит выбор доступных методов

        Product product3 = new Product("lays", 80);
//        product1.setName("twix");
//        product1.setPrice(100);


        vendingMashine.addProduct(product1);
        vendingMashine.addProduct(product2);
        vendingMashine.addProduct(product3);

//        System.out.println(product1);

        System.out.println(vendingMashine);

    }
}
