package theory.topic_06_oops;

public class SingletonExample {

    public static void main(String[] args) {

        SingletonClass x = SingletonClass.getInstance();
        SingletonClass y = SingletonClass.getInstance();

        System.out.println(x.hashCode());
        System.out.println(y.hashCode());

        if (x == y) {
            System.out.println("Same object");
        } else {
            System.out.println("Object not same");
        }

    }

}
