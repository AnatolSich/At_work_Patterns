package RStrategy;

public class StrategyTest {
    public static void main(String[] args) {
        CalculateStrategy strategySum = new Summation();
        CalculateStrategy strategySubstr = new Subtraction();
        CalculateStrategy strategyMult = new Multiplication();
        CalculateStrategy strategyDiv = new Division();

        CalculationContext context = new CalculationContext();

        context.setStrategy(strategySum);
        System.out.println(context.executeCalculation(4.5,2.0));
        context.setStrategy(strategySubstr);
        System.out.println(context.executeCalculation(4.5,2.0));
        context.setStrategy(strategyMult);
        System.out.println(context.executeCalculation(4.5,2.0));
        context.setStrategy(strategyDiv);
        System.out.println(context.executeCalculation(4.5,2.0));

    }
}
