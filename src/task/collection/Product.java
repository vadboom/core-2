package task.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// TODO: Учет товаров на складе:
//  Создайте класс Product с полями id, name и quantity.
//  Создайте метод, который будет принимать список товаров и выводить только товары с нулевым количеством на складе.
//  Создайте метод, который будет принимать список товаров и возвращать общее количество товаров на складе.
class Product {
   private int id;
   private String name;
   private int quantity;

    public Product(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public static void nullQuantity(List<Product> products) {
        for (Product product : products) {
            if (product.getQuantity() == 0) {
                System.out.println(product);
            }
        }
    }

    public static int quantityProduct(List<Product> products) {
        int sum = 0;
        for (Product product : products) {
            sum += product.getQuantity();
        }
        return sum;
    }

    public static void main(String[] args) {
        Product product1 = new Product(1, "помидор", 8998);
        Product product2 = new Product(2, "сахар", 0);
        Product product3 = new Product(3, "яйца", 3015);
        Product product4 = new Product(4, "хлеб", 0);
        List<Product> products = new ArrayList<>();
        Collections.addAll(products ,product1,product2,product3,product4);
        Product.nullQuantity(products);
        System.out.println(Product.quantityProduct(products));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}