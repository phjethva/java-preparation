package common;

interface Abs1 {

    void m1();

    default void m2() {
        System.out.println("m2 from Interface Abs1!");
    }

    static void m3() {
        System.out.println("m3 from Interface Abs1!");
    }

    private void m4() {
        System.out.println("m4 from Interface Abs1!");
    }

}
