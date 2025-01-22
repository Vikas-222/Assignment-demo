import Exceptions.InvalidOrderException;
import Exceptions.StockUnavailableException;

public class Order {

    private int orderId;
    private Customer customer;
    private Product product;
    private int quantity;

    public Order(int orderId, Customer customer, Product product, int quantity) throws InvalidOrderException, StockUnavailableException {
        if (quantity < 1) {
            throw new InvalidOrderException("Invalid quantity");
        }
        product.reduceStock(quantity);
        this.orderId = orderId;
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
    }

    public double calculateTotal() {
        return product.getPrice() * this.quantity;
    }


    @Override
    public String toString() {
        return "orderId=" + orderId +
                ", customer=" + customer +
                ", product=" + product +
                ", quantity=" + quantity;
    }
}
