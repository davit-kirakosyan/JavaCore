package homework.chapter14;

public class BoundsDemo {

    public static void main(String[] args) {
        Integer[] iNumes = {1, 2, 3, 4, 5,};
        Stars<Integer> iob = new Stars<>(iNumes);
        double v = iob.average();
        System.out.println("Cpeднee значение iob равно " + v);

        Double[] dNumes = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stars<Double> dob = new Stars<>(dNumes);
        double w = dob.average();
        System.out.println("Cpeднee значение dob равно " + w);
    }
}
