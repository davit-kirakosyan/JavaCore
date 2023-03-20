package homework.chapter11;

public class NewThread3 implements Runnable {
    String name;
    Thread t;

    NewThread3(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("Hoвый поток: " + t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Дoчepний поток: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.err.println(name + " прерван");
        }
        System.out.println(name + " завершен.");
    }
}
