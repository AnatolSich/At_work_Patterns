package TIterator;

public class IteratorTest {
    public static void main(String[] args) {

        IterableCollection collection = new ConcreteCollection();

        for (int i = 0; i < 6; i++) {
            collection.addElement("task"+i);
        }

        Iterator iterator = collection.createIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
