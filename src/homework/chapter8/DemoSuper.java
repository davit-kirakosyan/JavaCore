package homework.chapter8;

public class DemoSuper {


    public static void main(String[] args) {

        BoxWeight myBox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight myBox2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight myBox3 = new BoxWeight();
        BoxWeight myCuba = new BoxWeight(3, 2);
        BoxWeight myClone = new BoxWeight(myBox1);
        double vol;

        vol = myBox1.volume();
        System.out.println("myBox1: " + vol);
        System.out.println("myBox1 weigh: " + myBox1.weight);

        vol = myBox2.volume();
        System.out.println("myBox2: " + vol);
        System.out.println("myBox2 weigh: " + myBox2.weight);

        vol = myBox3.volume();
        System.out.println("myBox3: " + vol);
        System.out.println("myBox3 weigh: " + myBox3.weight);

        vol = myClone.volume();
        System.out.println("myClone: " + vol);
        System.out.println("myClone weigh: " + myClone.weight);

        vol = myCuba.volume();
        System.out.println("myCuba: " + vol);
        System.out.println("myCuba weigh: " + myCuba.weight);

    }
}
