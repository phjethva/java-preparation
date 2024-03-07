package pojo;

public class Employee implements Comparable {

    public int uid;
    public String name;

    public Employee(int uid, String name) {
        this.uid = uid;
        this.name = name;
    }

    @Override
    public String toString() {
        return uid + "--" + name;
    }

    @Override
    public int compareTo(Object o) {
        int uid1 = this.uid;
        Employee e = (Employee) o;
        int uid2 = e.uid;
        return Integer.compare(uid1, uid2);
    }

}
