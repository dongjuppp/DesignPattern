package create.factory;

public abstract class DefaultFactory implements IdolFactory {


    public void printName(String name){
        System.out.println(name+" 그룹 데뷔 준비중");
    }

    public void printSize(String name, int size){
        System.out.println(name + " 그룹 멤버수: "+size);
    }
}
