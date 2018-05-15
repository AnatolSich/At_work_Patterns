package IDecoratorSimple;

public class ConcreteComponent implements Component {

    @Override
    public void print(String str) {
        System.out.print(str);
    }
}
