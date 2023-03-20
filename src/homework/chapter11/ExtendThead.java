package homework.chapter11;

public class ExtendThead {

    public static void main(String[] args) {

        new NewThread2();

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Глaвный поток: " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.err.println("Глaвный поток прерван.");
        }
        System.out.println("Глaвный поток завершен.");
    }
}
