package homework.chapter11;

public class CurrentThreadDemo {

    public static void main(String[] args) {

        Thread t = Thread.currentThread();
        System.out.println("Пocлe изменения имени потока: " + t);


        t.setName("My Thread");
        System.out.println("Пocлe изменения имени потока: " + t);
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.err.println("Главный поток исполнения прерван");
        }
    }
}
