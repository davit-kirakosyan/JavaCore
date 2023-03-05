package homework.chapter14;

public class GenDemo {

    public static void main(String[] args) {

        Gen<Integer> iOb = new Gen<>(88);
        iOb.showType();

        int v = iOb.getOb();
        System.out.println("Знaчeниe: " + v);
        System.out.println();

        Gen<String> strOb = new Gen<>("Тест обобщений");

        strOb.showType();

        String str = strOb.getOb();
        System.out.println("Знaчeниe: " + str);
    }
}
