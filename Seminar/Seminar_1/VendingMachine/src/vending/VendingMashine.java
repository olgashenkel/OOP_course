package vending;

import product.Product;

import java.util.ArrayList;
import java.util.List;

public class VendingMashine {

    private List<Product> products;

    public VendingMashine() {
        products = new ArrayList<>();
    }

    public Product getByName(String nameProduct) { // метод выдачи продуктов
        for (Product product : products) {
            if (product.getName().equals(nameProduct)) {
                return product;
            }
        }
        return null;
    }


    public void addProduct(Product product) {  // метод добавления продуктов
        products.add(product);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(); // StringBuilder - используется, так как работа в цикле и неизвестно заранее количество итераций
        stringBuilder.append("Список продуктов:\n");
        for (Product product : products) { // создать ForEach - product.iter
            stringBuilder.append(product);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
