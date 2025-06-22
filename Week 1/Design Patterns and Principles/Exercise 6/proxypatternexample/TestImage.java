
package proxypatternexample;

public class TestImage {
     public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        // First time loading (lazy initialization)
        image1.display(); // Loads and displays
        System.out.println("--------------------");
        image1.display(); // Uses cached image
        System.out.println("--------------------");

        image2.display(); // Loads and displays
        System.out.println("--------------------");
        image2.display(); // Uses cached image
    }
}
