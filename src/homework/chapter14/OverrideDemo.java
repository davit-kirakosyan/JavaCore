package homework.chapter14;

public class OverrideDemo {

    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<>(88);
        Gen4<Integer> iOb4 = new Gen4<>(99);
        Gen4<String> strIOb4 = new Gen4<>("Тест обобщений");
        System.out.println(iOb.getOb());
        System.out.println(iOb4.getOb());
        System.out.println(strIOb4.getOb());

    }
}
