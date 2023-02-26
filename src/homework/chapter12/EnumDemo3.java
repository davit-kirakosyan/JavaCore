package homework.chapter12;

public class EnumDemo3 {

    public static void main(String[] args) {

        Apple ap;

        System.out.println("Яблoкo сорта Winesap стоит " +
                Apple2.WINESAP.getPrice() +
                " центов.");

        System.out.println("Цeны на все сорта яблок:");

        for (Apple2 a : Apple2.values()) {
            System.out.println(a + " стоит " + a.getPrice()
                    + " центов.");
        }
    }
}
