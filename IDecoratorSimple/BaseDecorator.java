package IDecoratorSimple;

public class BaseDecorator implements Component {
    Component wrappee;

    public BaseDecorator(Component wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void print(String str) {
        wrappee.print(str);
    }
}


class ConcreteDecoratorLeftBracket extends BaseDecorator {
    public ConcreteDecoratorLeftBracket(Component wrappee) {
        super(wrappee);
    }

    @Override
    public void print(String str) {
        System.out.print("[");
        super.print(str);
    }
}

class ConcreteDecoratorRightBracket extends BaseDecorator {
    public ConcreteDecoratorRightBracket(Component wrappee) {
        super(wrappee);
    }

    @Override
    public void print(String str) {
        super.print(str);
        System.out.print("]");
    }
}

class ConcreteDecoratorQuotes extends BaseDecorator {
    public ConcreteDecoratorQuotes(Component wrappee) {
        super(wrappee);
    }

    @Override
    public void print(String str) {
        System.out.print("\"");
        super.print(str);
        System.out.print("\"");
    }
}