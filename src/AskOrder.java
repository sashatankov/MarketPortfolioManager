

public class AskOrder implements Order {

    private double price;
    private double quantity;

    public AskOrder(double price, double quantity) {

        this.price = price;
        this.quantity = quantity;
    }
    @Override
    public double getOrderPriceInUSD() {
        return price;
    }

    @Override
    public double getOrderQuantityInUSD() {
        return quantity;
    }
}
