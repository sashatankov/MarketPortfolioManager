
/**
 * an abstract bid on an asset
 */
public interface Order {

    /**
     *
     * @return the desired price to make the order
     */
    double getOrderPriceInUSD();

    /**
     *
     * @return the desired quantity to make the order
     */
    double getOrderQuantityInUSD();
}
