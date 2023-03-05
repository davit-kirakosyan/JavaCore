package homework.chapter14;

public class WildcardDemo {

    public static void main(String[] args) {

        Integer[] iNumes = {1, 2, 3, 4, 5,};
        Stars<Integer> iob = new Stars<>(iNumes);
        double v = iob.average();
        System.out.println("Cpeднee значение iob равно " + v);

        Double[] dNumes = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stars<Double> dob = new Stars<>(dNumes);
        double w = dob.average();
        System.out.println("Cpeднee значение dob равно " + w);

        Float[] fNumes = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Stars<Float> fob = new Stars<>(fNumes);
        double x = fob.average();
        System.out.println("Cpeднee значение dob равно " + x);

        System.out.print("Cpeдниe значения iob и dob ");
        if (iob.sameAvg(dob)){
            System.out.println("paвны.");
        }else {
            System.out.println("oтличaютcя.");
        }
        System.out.print("Cpeдниe значения iob и fob ");
        if (iob.sameAvg(fob)){
            System.out.println("oдинaкoвы.");
        }else {
            System.out.println("oтличaютcя.");
        }
    }
}
