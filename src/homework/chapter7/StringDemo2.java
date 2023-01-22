package homework.chapter7;

public class StringDemo2 {

    public static void main(String[] args) {

        String strOb1 = "First line";
        String strOb2 = "Second line";
        String strOb3 = strOb1;

        System.out.println("length line strOb1: " + strOb1.length());
        System.out.println("Symbol of index 3 a line strOb1: " + strOb1.charAt(3));

        if (strOb1.equals(strOb2)) {
            System.out.println("strOb1 == srtOb2");
        }else {
            System.out.println("strOb1 != srtOb2");
        }
        if (strOb1.equals(strOb3)) {
            System.out.println("strOb1 == srtOb3");
        }else {
            System.out.println("strOb1 != srtOb3");
        }
    }
}
