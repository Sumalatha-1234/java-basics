//Write a program to demonstrate a deadlock situation in Java.
class Resource {
    synchronized void methodA(Resource r) {
        System.out.println(Thread.currentThread().getName() + " locked methodA");
        try { Thread.sleep(100); } catch (InterruptedException e) {}
        r.methodB();
    }

    synchronized void methodB() {
        System.out.println(Thread.currentThread().getName() + " locked methodB");
    }
}

public class DeadlockDemo {
    public static void main(String[] args) {
        Resource r1 = new Resource();
        Resource r2 = new Resource();

        Thread t1 = new Thread(() -> r1.methodA(r2), "Thread-1");
        Thread t2 = new Thread(() -> r2.methodA(r1), "Thread-2");

        t1.start();
        t2.start();
    }
}
