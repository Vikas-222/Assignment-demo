import Exceptions.InvalidOrderException;
import Exceptions.OrderNotFoundException;
import Exceptions.StockUnavailableException;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Set<Product> product = new HashSet<>();

        Product p1 = new Product(1, "Iphone X", 70000.00, 5);
        Product p2 = new Product(2, "Iphone 11", 75000.00, 5);

        product.add(p1);
        product.add(p2);


        Customer customer1 = new Customer(101, "Vikas", "vikas@gmail.com", 123456);
        Customer customer2 = new Customer(102, "Arpan", "arpan@gmail.com", 128956);


        ShoppingCart customer1Cart = new ShoppingCart(customer1);
        ShoppingCart customer2Cart = new ShoppingCart(customer2);

        try {
            // first order customer1
            Order order1 = new Order(1001, customer1, p1, 3);
            customer1Cart.addOrder(order1);


            //second order customer1
            Order order2 = new Order(1002, customer1, p2, 2);
            customer1Cart.addOrder(order2);


            //first order customer2
            Order order3 = new Order(1003, customer2, p1, 3);
            customer2Cart.addOrder(order3);


            //second order customer2
            Order order4 = new Order(1004, customer2, p2, 1);
            customer2Cart.addOrder(order4);


            System.out.println("Customer1 cart: " + customer1Cart.viewCart());
            System.out.println("Customer2 cart: " + customer2Cart.viewCart());

            System.out.println(customer1Cart.getCustomer(customer1) + " Order placed with bill amount is " + customer1Cart.Checkout());

            System.out.println(customer2Cart.getCustomer(customer2) + " Order placed with bill amount is " + customer2Cart.Checkout());

            System.out.println("Customer1 cart: " + customer1Cart.viewCart());
            System.out.println("Customer2 cart: " + customer2Cart.viewCart());
        } catch (InvalidOrderException e) {
            System.out.println(e.getMessage());
        } catch (StockUnavailableException e) {
            System.out.println(e.getMessage());
        } catch (OrderNotFoundException e) {
            System.out.println(e.getMessage());
        }


    }


}
