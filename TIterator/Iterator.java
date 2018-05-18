package TIterator;

public interface Iterator {
    Object next();

    boolean hasNext();
}

class ConcreteIterator implements Iterator {

    IterableCollection collection;
    int index;

    public ConcreteIterator(IterableCollection collection) {
        this.collection = collection;
    }

    @Override
    public Object next() {
        Object o = collection.getInternalArray()[index++];
        return o;
    }

    @Override
    public boolean hasNext() {
        if (index < collection.getInternalArray().length)
            return true;
        else return false;
    }
}