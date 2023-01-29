package homework.chapter8;

public class RefDemo {

    public static void main(String[] args) {
        BoxWeight weightBox = new BoxWeight(3, 5, 7, 8.37);
        Box plainBox = new Box();
        double vol;

        vol = weightBox.volume();
        System.out.println("weightBox: " + vol);
        System.out.println("weightBox: " + weightBox.weight);

        plainBox = weightBox;
        vol = plainBox.volume();
        System.out.println("plainBox: " + vol);
//        System.out.println("plainBox weight: " + plainBox.weight);


    }
}
