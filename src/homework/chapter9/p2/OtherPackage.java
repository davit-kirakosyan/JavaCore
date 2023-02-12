package homework.chapter9.p2;

import homework.chapter9.p1.Protection;


public class OtherPackage {

    Protection p = new Protection();

       OtherPackage(){
           System.out.println("конструктор, унаследованный из другого пакета");

//        доступно только для данного класса или пакета
//        System.out.println("n = " + p.n);

//        доступно только для данного класса
//        System.out.println("n_pri = " + p.n_pri);

//           доступно только для данного класса,
//           подкласса или пакета
//           System.out.println("n_pro = " + p.n_pro);

           System.out.println("n_pub = " + p.n_pub);
       }
}
