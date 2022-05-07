package prototype;

public class Main {


    public void main() throws CloneNotSupportedException{
        FromDbData fromDbData = new FromDbData();

        FromDbData stupidClone = new FromDbData();
        stupidClone.setAge(fromDbData.getAge());
        stupidClone.setName(fromDbData.getName());
        stupidClone.setSchoolName(fromDbData.getSchoolName());



        FromDbData smartClone = (FromDbData) fromDbData.clone();

        System.out.println(smartClone != fromDbData); //False
        System.out.println(smartClone.equals(fromDbData)); //True
        System.out.println(smartClone.getClass() == fromDbData.getClass()); //True

    }
}
