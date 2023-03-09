package homework.chapter14;

public class HierDemo2 {

    public static void main(String[] args) {

        Gen3<String> w = new Gen3<>("Добро пожаловать", 47);

        System.out.print(w.getOb() + " ");
        System.out.println(w.getNum());
    }
}
