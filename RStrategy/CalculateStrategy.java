package RStrategy;

public interface CalculateStrategy {
    Double calculate(Double a, Double b);
}

class Summation implements CalculateStrategy{

    @Override
    public Double calculate(Double a, Double b) {
        return a+b;
    }
}

class Division implements CalculateStrategy{
    @Override
    public Double calculate(Double a, Double b) {
        return a/b;
    }
}

class Subtraction implements CalculateStrategy{
    @Override
    public Double calculate(Double a, Double b) {
        return a-b;
    }
}

class Multiplication implements CalculateStrategy{
    @Override
    public Double calculate(Double a, Double b) {
        return a*b;
    }
}



