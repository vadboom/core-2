package task.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// TODO: Учет заказов:
//  Создайте класс Order с полями id, customer и totalAmount.
//  Создайте метод, который будет принимать список заказов и выводить заказы с наибольшей суммой.
//  Создайте метод, который будет принимать список заказов и возвращать общую сумму всех заказов.

public class Order {
    private int id;
    private String customer;
    private int totalAmount;

    Order(int id, String customer, int totalAmount) {
        this.id = id;
        this.customer = customer;
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customer='" + customer + '\'' +
                ", totalAmount=" + totalAmount +
                '}';
    }

    public static void maxOrder(List<Order> list) {
        int maxSum = 0;
        for (Order ord : list) {
            if (maxSum < ord.getTotalAmount()) {
                maxSum += ord.getTotalAmount();
            }
        }
        for (Order ord : list) {
            if (maxSum == ord.getTotalAmount()); {
                System.out.println(ord);
            }
        }
    }

    public static int amountOfOrders(List<Order> list) {
        int sum = 0;
        for (Order ord : list) {
            sum += ord.getTotalAmount();
        }
        return sum;
    }

    public static void main(String[] args) {
        Order customer1 = new Order(1, "Akim", 8998);
        Order customer2 = new Order(2, "Vadim", 1023);
        Order customer3 = new Order(3, "Roman", 5453);
        Order customer4 = new Order(4, "Dima", 6342);
        List<Order> list = new ArrayList<>();
        Collections.addAll(list, customer1, customer2, customer3, customer4);

        Order.maxOrder(list);
        System.out.println(Order.amountOfOrders(list));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }
}