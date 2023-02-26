package homework.chapter12;

public class EnumDemo2 {

    public static void main(String[] args) {

        Apple ap;

        ap = Apple.RED_DEL;

        System.out.println("Константы перечислимого типа Apple:");

        Apple[] values = Apple.values();
        for (Apple a : values) {
            System.out.println(a);
        }
        System.out.println();

        ap = Apple.valueOf("WINESAP");
        System.out.println("Пepeмeннaя ар содержит " + ap);

    }
}
