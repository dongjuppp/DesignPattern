package behaivirol.iterator;

import java.util.Iterator;

public class Client {

    public static void main(String[] args) {
        Item one = new Item(7);
        Item two = new Item(2);
        Item three = new Item(3);

        ItemBox<Item> box = new ItemBox<>();
        box.add(one);
        box.add(two);
        box.add(three);


        Iterator<Item> iter = box.getOrderedIterator();

        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
