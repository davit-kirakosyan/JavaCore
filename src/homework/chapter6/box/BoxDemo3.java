package homework.chapter6.box;

public class BoxDemo3 {


    public static void main(String[] args) {

        Box myBox1 = new Box();
        Box myBox2 = new Box();

        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;


        System.out.print("myBox1: ");
        myBox1.volume1();

        System.out.print("myBox2: ");
        myBox2.volume1();
    }
}
