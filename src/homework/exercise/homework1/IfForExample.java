package homework.exercise.homework1;

public class IfForExample {

    public static void main(String[] args) {

//        Ստեղծեք երկու int տիպի փոփոխական a և b իրենց արժեքներով(դուք որոշեք արժեքները)։
//        Գրեք կոդ, որը կտպի այդ երկու փոփոխականից մեծը։ Օրինակ ունենք a=10, b=40. կտպի`max: 40 :

        int a = 30, b = 15;
        if (a > b) {
            System.out.println("max: " + a);
        } else {
            System.out.println("max: " + b);
        }

//        Գրեք կոդ, որ այդ նույն թվերից փոքրից մինչև մեծ ցիկլ կֆռռա,
//        ու կտպի իրենց արանքում գտնվող բոլոր թվերը։ Օրինակ a=5, b=10. կտպի 5,6,7,8,9,10:

        if (a <= b) {
            for (int i = a; i <= b; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = b; i <= a; i++) {
                System.out.print(i + " ");
            }
        }

//        Փոխակերպել a-ի արժեքը char-տիպի, ու տպել թե ինչ սինվոլ ստացվեց։ Նույնը b-ի համար:

        System.out.println();
        char c = (char) a;
        char k = (char) b;
        System.out.println(c + " " + k);


//        Գրել կոդ, որը կստուգի եթե a-ն հավասար է b-ին, կտպի` a-ն հավասար է բ-ին, եթե ոչ, կտպի որ հավասար չէ։

        if (a == b) {
            System.out.println("a հավասար է b-ին");
        } else {
            System.out.println("հավասար չէ");
        }
    }
}
