package pojo;

public class Student extends Person {
    int rollNum;

    public Student() {
        System.out.println(this);
        System.out.println(this.hashCode());
    }

    public Student(int uid, String name, int age, int rollNum) {
        super(uid, name, age);
        this.rollNum = rollNum;
    }

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "uid=" + uid +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", rollNum=" + rollNum +
                '}';
    }

}
