package observerpatternexample;

public class TestStockMarket {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileObserver = new MobileApp("Mobile Tracker");
        Observer webObserver = new WebApp("Web Tracker");

        stockMarket.registerObserver(mobileObserver);
        stockMarket.registerObserver(webObserver);

        stockMarket.setStockPrice(99.50);
        System.out.println("----------------------");

        stockMarket.setStockPrice(105.25);
        System.out.println("----------------------");

        stockMarket.deregisterObserver(webObserver);
        stockMarket.setStockPrice(110.00);
    }
}
