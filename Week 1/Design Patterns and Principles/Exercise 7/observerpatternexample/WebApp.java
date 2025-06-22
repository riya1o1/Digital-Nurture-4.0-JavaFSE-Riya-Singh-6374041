package observerpatternexample;

public class WebApp implements Observer {
    private String siteName;

    public WebApp(String siteName) {
        this.siteName = siteName;
    }

    @Override
    public void update(double stockPrice) {
        System.out.println("[" + siteName + "] Stock price updated to: " + stockPrice);
    }
}
