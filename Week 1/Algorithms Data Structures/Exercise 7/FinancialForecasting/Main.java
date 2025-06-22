public class Main {
    public static void main(String[] args) {
        double principal = 10000; 
        double rate = 0.08;      
        int years = 5;

        System.out.println("Recursive Forecast:");
        double result = FinancialForecast.futureValue(principal, rate, years);
        System.out.printf("Future Value after %d years: Rs%.2f\n", years, result);

        System.out.println("\nMemoized Forecast:");
        double[] memo = new double[years + 1];
        double resultMemo = FinancialForecast.futureValueMemo(principal, rate, years, memo);
        System.out.printf("Future Value after %d years: Rs%.2f\n", years, resultMemo);
    }
}
