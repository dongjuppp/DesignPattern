package create.prototype;

public class FromDbData implements Cloneable {

    private String name;

    private String schoolName;

    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    @Override
    public boolean equals(Object obj) {
        FromDbData target = (FromDbData)obj;

        return this.name == target.name
                && this.age==target.age
                && this.schoolName == target.schoolName;
    }
}
