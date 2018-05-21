package YInterprener;

public class InterpreterTest {
    public static void main(String[] args) {
        Context context = new Context();
        AbstractExpression expression = context.evaluate("25-40+2");
        System.out.println(expression.interpret());
    }
}
