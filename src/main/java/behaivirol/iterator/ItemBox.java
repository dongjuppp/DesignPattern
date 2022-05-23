package behaivirol.iterator;

import java.util.*;
import java.util.stream.Collectors;

public class ItemBox<T extends Comparable> implements Box<T> {

    private List<T> box = new ArrayList<>();


    @Override
    public Iterator<T> getOrderedIterator() {
        List<T> list = new ArrayList<>(box);
        Collections.sort(list);
        return list.iterator();
    }

    @Override
    public void add(T t) {
        box.add(t);
    }
}
