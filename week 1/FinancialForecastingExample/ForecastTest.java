public class ForecastTest {

    public static void main(String[] args) {

        double currentValue = 10000.0;
        double annualGrowthRate = 0.10; // 10%
        int years = 5;

        double futureValue = FinancialForecast.predictFutureValue(
                currentValue,
                annualGrowthRate,
                years
        );

        System.out.println("Current Value : ₹" + currentValue);
        System.out.println("Growth Rate   : " + (annualGrowthRate * 100) + "%");
        System.out.println("Years         : " + years);
        System.out.printf("Future Value  : ₹%.2f%n", futureValue);

    }
}