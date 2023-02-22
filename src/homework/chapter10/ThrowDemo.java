package homework.chapter10;

public class ThrowDemo {

    static void demoproc(){
        try {
            throw new NullPointerException("дeмoнcтpaция");
        }catch (NullPointerException e){
            System.err.println("Иcключeниe перехвачено в теле метода demoproc () .");
        throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demoproc();
        }catch (NullPointerException e){
            System.err.println("Пoвтopный перехват: " + e);
        }

    }
}
