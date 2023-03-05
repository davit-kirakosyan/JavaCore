package homework.chapter14;

public class SimpGen {

    public static void main(String[] args) {

        TowGen<Integer, String> tgObj = new TowGen<>(88, "Обобщения");

        tgObj.showTypes();

        int v = tgObj.getOb1();
        System.out.println("Знaчeниe: " + v);

        String str = tgObj.ob2;
        System.out.println("Знaчeниe: " + str);
    }
}
