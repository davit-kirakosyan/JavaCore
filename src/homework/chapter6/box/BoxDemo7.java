package homework.chapter6.box;

public class BoxDemo6 {


    public static void main(String[] args) {

        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;


        vol = mybox1.volume();
        System.out.println("myBox1 = " + vol);
        vol = mybox2.volume();
        System.out.println("myBox2 = " + vol);

    }
}
