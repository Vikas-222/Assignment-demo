import Exceptions.InvalidOrderException;
import Exceptions.OrderNotFoundException;
import Exceptions.StockUnavailableException;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main2 {

    Customer customer1 = new Customer(101, "Vikas", "vikas@gmail.com", 123456);
    Customer customer2 = new Customer(102, "Arpan", "arpan@gmail.com", 128956);


    Product p1 = new Product(1, "Iphone X", 70000.00, 5);
    Product p2 = new Product(2, "Iphone 11", 75000.00, 5);


    ShoppingCart customer1Cart = new ShoppingCart(customer1);
    ShoppingCart customer2Cart = new ShoppingCart(customer2);

    Scanner sc1 = new Scanner(System.in);

    private void placeOrder() throws InvalidOrderException, StockUnavailableException {

        System.out.println("Enter orderId: ");
        int orderId = sc1.nextInt();
        System.out.println("Enter CustomerId: ");
        int customerId = sc1.nextInt();
        System.out.println("Enter productId: ");
        int productId = sc1.nextInt();
        System.out.println("Enter quantity: ");
        int quantity = sc1.nextInt();
        Order order;
        if (customerId == 101) {
            if (productId == 1) {
                order = new Order(orderId, customer1, p1, quantity);
            } else {
                order = new Order(orderId, customer1, p2, quantity);
            }
            customer1Cart.addOrder(order);
        } else {
            if (productId == 1) {
                order = new Order(orderId, customer2, p1, quantity);
            } else {
                order = new Order(orderId, customer2, p2, quantity);
            }
            customer2Cart.addOrder(order);
        }
    }

    private void viewCart() throws OrderNotFoundException {
        System.out.println("Enter CustomerId: ");
        int customerId = sc1.nextInt();
        if (customerId == 101) {
            System.out.println(customer1Cart.viewCart());
        } else {
            System.out.println(customer2Cart.viewCart());
        }
    }

    private void Checkout() throws OrderNotFoundException {
        System.out.println("Enter customerID: ");
        int customerId = sc1.nextInt();
        if (customerId == 101) {
            System.out.println("Total Bill : " + customer1Cart.Checkout());
        } else {
            System.out.println("Total Bill : " + customer2Cart.Checkout());
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Main2 main2 = new Main2();

        Set<Product> product = new HashSet<>();
        product.add(main2.p1);
        product.add(main2.p2);

        int choice;
        do {
            System.out.println("1. View Products");
            System.out.println("2. To place Order");
            System.out.println("3. To view cart");
            System.out.println("4. To checkout");
            System.out.println("0. To exit");

            choice = sc.nextInt();


            switch (choice) {
                case 1:
                    System.out.println("Products: ");
                    System.out.println(product + "");
                    break;

                case 2:
                    try {
                        main2.placeOrder();
                    } catch (InvalidOrderException e) {
                        System.out.println(e.getMessage());
                    } catch (StockUnavailableException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    try {
                        main2.viewCart();
                    } catch (OrderNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    try {
                        main2.Checkout();
                    } catch (OrderNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 0:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Please select valid choice");
                    break;
            }

        } while (choice >= 0 && choice < 5);
    }


}
