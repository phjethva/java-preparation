package theory.topic_08_multithreading;

import java.util.regex.Pattern;

class ThreadExample {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Current Thread Name: " + Pattern.compile("^.").matcher(Thread.currentThread().getName()).replaceFirst(i -> i.group().toUpperCase()) + " Thread ");

        MyThread myThread = new MyThread();
        myThread.start();

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();

    }

}
