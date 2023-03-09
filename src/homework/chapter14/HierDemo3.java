package homework.chapter14;

public class HierDemo3 {

    public static void main(String[] args) {

        Gen<Integer> iOb = new Gen<>(88);
        Gen4<Integer> iOb2 = new Gen4<>(99);

        Gen4<String> strOb2 = new Gen4<>("Tecт обобщений");

        if (iOb2 instanceof Gen4<?>){
            System.out.println("Oбъeкт iOb2 является экземпляром класса Gen2");
        }

        if (iOb2 instanceof Gen<?>){
            System.out.println("Oбъeкт iOb2 является экземпляром класса Gen");
        }
        System.out.println();

        if (strOb2 instanceof Gen4<?>){
            System.out.println("Oбъeкт strOb2 является экземпляром класса Gen2");
        }

        if (strOb2 instanceof Gen<?>){
            System.out.println("Oбъeкт strOb2 является экземпляром класса Gen");
        }
        System.out.println();

        if (iOb instanceof Gen4<?>){
            System.out.println("Oбъeкт iOb является экземпляром класса Gen2");
        }

        if (iOb instanceof Gen<?>){
            System.out.println("Oбъeкт iOb является экземпляром класса Gen");
        }
        System.out.println();
    }
}
