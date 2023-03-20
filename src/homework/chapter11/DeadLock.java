package homework.chapter11;

public class DeadLock implements Runnable {

    A a = new A();
    B b = new B();

    DeadLock(){
        Thread.currentThread().setName("Главный поток");
        Thread t = new Thread(this,"Соперничающий поток");
        t.start();

        a.foo(b);
        System.out.println("Haзaд в главный поток");
    }

    @Override
    public void run() {
        b.bar(a);
        System.out.println("Haзaд в другой поток");
    }

    public static void main(String[] args) {
        new DeadLock();
    }
}
