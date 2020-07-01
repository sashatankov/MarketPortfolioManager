
/**
 * an abstract portfolio
 */
public interface Portfolio {

    /**
     * adds asset to portfolio
     * @param asset an financial asset to add
     * @return true if asset added
     */
    boolean addAsset(Asset asset);

    /**
     * removes asset from portfolio
     * @param asset a financial asset to remove
     * @return true, if asset removed successfully
     */
    boolean removeAsset(Asset asset);

    /**
     *
     * @return the total value of the portfilio in US dollars
     */
    double getValueInUSD();

    /**
     *
     * @return the total profit of the portfolio in US dollars, negative
     * if loss
     */
    double getProfitInUSD();
}
