package behaivirol.iterator;

import java.util.Iterator;

public interface Box<T> {

   Iterator<T> getOrderedIterator();

    void add(T t);
}
