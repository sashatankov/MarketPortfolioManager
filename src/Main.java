import java.util.Scanner;

/**
 * Command line utility portfolio manager
 */
public class Main {

    public static final int PRINT_PORTFOLIO = 1;
    public static final int ADD_ASSET_TO_PORTFOLIO = 2;
    public static final int REMOVE_ASSET_FROM_PORTFOLIO = 3;
    public static final int PRINT_QUOTES = 4;
    public static final int EXIT = 0;

    private static PortfolioManager portfolioManager = new PortfolioManager();

    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);
        int mainMenuInput;

        while(true){
            printMainMenu();
            mainMenuInput = inputScanner.nextInt();
            processMainMenuInput(mainMenuInput);
        }
    }

    /**
     * prints the main menu of the portfolio manager to the console
     */
    public static void printMainMenu(){
        System.out.println("---------WELCOME TO FINMANAGE-----------");
        System.out.println("1 -- Print portfolio");
        System.out.println("2 -- Add asset to portfolio");
        System.out.println("3 -- Remove asset from portfolio");
        System.out.println("4 -- Print stock quotes");
        System.out.println("0 -- Exit");
    }

    /**
     * prints the assets of the portfolio to the console
     */
    public static void printPortfolio() {
        // TODO
    }

    /**
     * asks user for an asset, and adds it to the portfolio.
     */
    public static void addAssetToPortfolio() {
        // TODO
    }

    /**
     * asks user for an asset to remove from portfolio, and removes
     * it from the portfolio
     */
    public static void removeAssetFromPortfolio() {
        // TODO
    }

    /**
     * asks the user for quotes and gets the quotes of the given name
     */
    public static void getQuotes() {
        // TODO
    }

    /**
     * asks user for quotes and prints quotes to the console.
     */
    public static void printQuotes() {
        // TODO
    }

    /**
     *
     * @param mainMenuInput a non-negative integer representing an action
     * for the portfolio manager to execute.
     */
    public static void processMainMenuInput(int mainMenuInput) {

        if(mainMenuInput == PRINT_PORTFOLIO) {
            printPortfolio();
        } else if(mainMenuInput == ADD_ASSET_TO_PORTFOLIO) {
            addAssetToPortfolio();
        } else if(mainMenuInput == REMOVE_ASSET_FROM_PORTFOLIO) {
            removeAssetFromPortfolio();
        } else if(mainMenuInput == PRINT_QUOTES) {
            printQuotes();
        } else if(mainMenuInput == EXIT) {
            System.exit(0);
        }
    }


}
