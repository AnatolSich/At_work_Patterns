package RStrategy;

public class CalculationContext {
    CalculateStrategy strategy;

    public void setStrategy(CalculateStrategy strategy) {
        this.strategy = strategy;
    }

    Double executeCalculation(Double a, Double b){
        return  strategy.calculate(a,b);
    }

}
