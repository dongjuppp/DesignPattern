package factory;

public interface IdolFactory {

    default Idol createIdol(String name, int size){
        printName(name);

        printSize(name, size);

        return getIdol();
    }

    void printName(String name);

    void printSize(String name, int size);

    Idol getIdol();
}
