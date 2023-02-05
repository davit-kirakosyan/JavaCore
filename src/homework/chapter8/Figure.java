package homework.chapter8;

abstract class Figure {

    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

//       double area(){
//        System.out.println("Плoщaдь фигуры не определена.");
//        return 0;
//    }

    abstract double area();
}
