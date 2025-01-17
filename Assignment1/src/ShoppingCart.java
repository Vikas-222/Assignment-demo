import Exceptions.OrderNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private Customer customer;
    private List<Order> cart;

    public ShoppingCart(Customer customer) {
        this.customer = customer;
        cart = new ArrayList<>();
    }

    public String getCustomer(Customer customer) {
        return customer.getCustomerName();
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    public void addOrder(Order order) {
        cart.add(order);
    }


    public void removeOrder(Order order) throws OrderNotFoundException {
        if (cart.isEmpty() == true) {
            throw new OrderNotFoundException("No such order found! Cart is empty");
        } else {
            cart.remove(order);
        }
    }

    public String viewCart() throws OrderNotFoundException {
        if (cart.isEmpty() == true) {
            throw new OrderNotFoundException("Cart is empty");
        } else {
            return "Your cart = " + cart;
        }
    }

    public double Checkout(){
        double Bill = 0.0;
        double totalBill = 0.0;
        for (Order o : cart) {
            Bill += o.calculateTotal();
        }
        cart.clear();
        totalBill = Bill + 100;  //delivery charge
        return totalBill;
    }

}
