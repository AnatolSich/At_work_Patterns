package TIterator;

public interface IterableCollection {
    Iterator createIterator();

    Object[] getInternalArray();

    void addElement(Object o);
}


abstract class AbstractCollection implements IterableCollection {
    Object[] internalArray = new Object[10];

    public void addElement(Object o) {
        boolean flag = true;
        int i = 0;
        while (flag) {
            if (internalArray[i] != null) {
                i++;
            } else{
                internalArray[i] = o;
                flag = false;
            }
        }
    }
}


class ConcreteCollection extends AbstractCollection implements IterableCollection {


    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    @Override
    public Object[] getInternalArray() {
        return internalArray;
    }
}