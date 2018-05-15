package IDecoratorSimple;

public class DecoratorTest {

    public static void main(String[] args) {
        ConcreteComponent concreteComponent = new ConcreteComponent();
        concreteComponent.print("Test");
        System.out.println();

        ConcreteDecoratorLeftBracket concreteDecoratorLeftBracket = new ConcreteDecoratorLeftBracket(concreteComponent);
        concreteDecoratorLeftBracket.print("Test");
        System.out.println();

        ConcreteDecoratorRightBracket concreteDecoratorRightBracket = new ConcreteDecoratorRightBracket(concreteDecoratorLeftBracket);
        concreteDecoratorRightBracket.print("Test");
        System.out.println();

        ConcreteDecoratorQuotes concreteDecoratorQuotes = new ConcreteDecoratorQuotes(concreteDecoratorRightBracket);
        concreteDecoratorQuotes.print("Test");
        System.out.println();

        new ConcreteDecoratorQuotes(
                new ConcreteDecoratorRightBracket(
                        new ConcreteDecoratorLeftBracket(
                                new ConcreteComponent()
                        )
                )
        ).print("Test2");
        System.out.println();

        new ConcreteDecoratorQuotes(
                new ConcreteDecoratorLeftBracket(
                        new ConcreteDecoratorRightBracket(
                                new ConcreteComponent()
                        )
                )
        ).print("Test3");
        System.out.println();


        new ConcreteDecoratorLeftBracket(
                new ConcreteDecoratorRightBracket(
                        new ConcreteDecoratorQuotes(
                                new ConcreteComponent()
                        )
                )
        ).print("Test5");
        System.out.println();


    }
}
