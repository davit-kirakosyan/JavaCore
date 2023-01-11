package homework.chapter6.box;

public class Box {

    double width;
    double height;
    double depth;


    Box() {
        width = 10;
        height = 10;
        depth = 10;
    }

    Box(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    void volume1() {
        System.out.println(width * height * depth);
    }

    double volume() {
        return width * height * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}
