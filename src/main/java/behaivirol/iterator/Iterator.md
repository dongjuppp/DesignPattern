이터레이터 패턴
===

1. 집합 객체 내부 구조를 노출시키지 않고 순회 하는 방법을 제공하는 패턴.
2. 집합 객체를 순회하는 클라이언트 코드를 변경하지 않고 다양한 순회 방법을 제공할 수 있
   다.
   

```java
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
```


```java
public class ItemBox<T extends Comparable> implements Box<T> {

    private List<T> box = new ArrayList<>();

    
    // 정렬후 이터레이터 리턴 클라리언트는 정렬 내용 몰라도 순회 가능
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
```

<br>

```java
public interface Box<T> {

   Iterator<T> getOrderedIterator();

    void add(T t);
}
```
