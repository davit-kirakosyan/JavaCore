package homework.chapter14;

public class GenCons {

    private double val;

    <T extends Number> GenCons(T arg){
        val = arg.doubleValue();
    }

    void showVol(){
        System.out.println("vol: " + val);
    }
}
