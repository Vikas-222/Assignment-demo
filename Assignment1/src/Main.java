import Exceptions.InvalidOrderException;
import Exceptions.OrderNotFoundException;
import Exceptions.StockUnavailableException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Product p1 = new Product(1, "Iphone X", 70000.00, 5);
        Product p2 = new Product(2, "Iphone 11", 75000.00, 5);

        Customer customer1 = new Customer(101, "Vikas", "vikas@gmail.com", 123456);
        Customer customer2 = new Customer(102, "Arpan", "arpan@gmail.com", 128956);

        ShoppingCart customer1Cart = new ShoppingCart(customer1);
        ShoppingCart customer2Cart = new ShoppingCart(customer2);


        try {
            //first order customer1
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


        Scanner sc = new Scanner(System.in);


        System.out.println("1. To add Product");
        System.out.println("2. To add Customer");
        System.out.println("3. To place Order");
        System.out.println("4. To view cart");
        System.out.println("5. To checkout");
        System.out.println("6. To exit");

        int choice = sc.nextInt();
        while(choice >= 1 && choice <= 6)
        {
            switch (choice){
                case 1:
                    System.out.println("Enter product id:");
                    int productid = sc.nextInt();
                    System.out.println("Enter product name:");
                    String productname = sc.nextLine();
                    System.out.println("Enter product price:");
                    float price = sc.nextFloat();
                    System.out.println("Enter product quantity:");
                    int qty = sc.nextInt();

                    Product p = new Product(productid,productname,price,qty);

                case 2:
                    System.out.println("Enter customer id:");
                    int customerid = sc.nextInt();
                    System.out.println("Enter customer name:");
                    String customername = sc.nextLine();
                    System.out.println("Enter customer email:");
                    String email = sc.nextLine();
                    System.out.println("Enter customer contact no.:");
                    int contact = sc.nextInt();

                    Customer c = new Customer(customerid,customername,email,contact);
            }
        }



    }
}
