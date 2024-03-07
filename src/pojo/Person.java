package pojo;

public class Person {

    int uid;
    String name;
    int age;

    public Person() {
        System.out.println(this);
        System.out.println(this.hashCode());
    }

    public Person(int uid, String name, int age) {
        this.uid = uid;
        this.name = name;
        this.age = age;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
