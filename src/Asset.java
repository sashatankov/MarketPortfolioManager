

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

    /**
     *
     * @return name of the asset in the 3-letter form or 4-letter form
     * for example: fot Microsoft - MSFT
     */
    String getName();

}
