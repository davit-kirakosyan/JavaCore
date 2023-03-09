package homework.chapter14;

public class RawDemo {

    public static void main(String[] args) {

        Gen<Integer> iOb = new Gen<>(88);
        Gen<String> strOb = new Gen<>("Tecт обобщений");

        Gen raw = new Gen(new Double(98.6));

        double d = (Double) raw.getOb();
        System.out.println("Знaчeниe: " + d);

    }
}
