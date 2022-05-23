package behaivirol.iterator;

import java.util.Comparator;

public class Item implements Comparable<Item> {

    private int id;

    public Item(int id){
        this.id = id;
    }

    @Override
    public String toString(){
        return Integer.toString(id);
    }


    @Override
    public int compareTo(Item o) {
        return o.id > this.id ? -1:1;
    }
}
