


public class BidOrder implements Order {

    private double price;
    private double quantity;

    public BidOrder(double price, double quantity){

        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public double getOrderPriceInUSD() {
        return 0;
    }

    @Override
    public double getOrderQuantityInUSD() {
        return 0;
    }
}
