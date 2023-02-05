package homework.chapter8;

public class FindAreas {

    public static void main(String[] args) {

//        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figureF;

        figureF = r;
        System.out.println("Плoщaдь равна " + figureF.area());

        figureF = t;
        System.out.println("Плoщaдь равна " + figureF.area());

//        figureF = f;
//        System.out.println("Плoщaдь равна " + figureF.area());

    }
}
