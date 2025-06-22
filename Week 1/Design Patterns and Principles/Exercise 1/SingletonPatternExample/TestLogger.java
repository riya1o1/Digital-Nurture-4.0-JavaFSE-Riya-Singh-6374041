package SingletonPatternExample;

public class TestLogger {
    public static void main(String[] args){
        Logger logger1 = Logger.getInstance();
        logger1.log("Starting Application");
        
        Logger logger2 = Logger.getInstance();
        logger2.log("Continuing Application");
        
        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same.");
        } else {
            System.out.println("Different logger instances found.");
        }
    }
}
