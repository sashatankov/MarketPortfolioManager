

public interface Asset {

    /**
     *
     * @return the current price of the asset in the market
     */
    double getCurrentPriceInUSD();

    /**
     *
     * @return the price, the asset was originally purchased
     */
    double getPurchasePriceInUSD();

}
